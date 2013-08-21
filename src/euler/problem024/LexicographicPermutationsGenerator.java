package euler.problem024;

public class LexicographicPermutationsGenerator {

    private final int size;

    private boolean finished;

    private int keyIndex;
    private int keyDigit;

    private int[] digits;

    public LexicographicPermutationsGenerator(final int size) {
        this.size = size;

        this.finished = false;
        this.keyIndex = this.size - 1;
        this.keyDigit = this.size - 1;

        startNewPermutation();
    }

    public int next() {

        if (this.finished) {
            return -1;
        }

        final int result = digitsToInteger();

        prepareNextResult();

        return result;
    }

    private void prepareNextResult() {

        for (int current = this.keyIndex; current < this.digits.length - 1; ++current) {
            final int currentValue = this.digits[current];
            final int nextValue = this.digits[current + 1];

            if (nextValue > currentValue) {
                swap(current, current + 1);

                return;
            }
        }

        if (this.keyIndex == 0) {
            this.keyIndex = this.size - 1;
            this.keyDigit--;
        } else {
            --this.keyIndex;
        }

        if (this.keyDigit < 0) {
            this.finished = true;
        } else {
            startNewPermutation();
        }

    }

    private void startNewPermutation() {
        this.digits = new int[this.size];

        int value = 0;

        for (int current = 0; current <= this.size - 1; ++current) {

            if (value == this.keyDigit) {
                ++value;
            }

            if (current == this.keyIndex) {
                this.digits[current] = this.keyDigit;
            } else {
                this.digits[current] = value++;
            }
        }
        /*
        System.arraycopy(this.base, 0, this.digits, 0, this.base.length);

        final int indexToSwap = this.keyIndex + 1;

        if (indexToSwap >= this.base.length) {
            return;
        }

        swap(this.keyIndex, indexToSwap);
        */
    }

    private void swap(final int first, final int second) {
        final int glass = this.digits[first];
        this.digits[first] = this.digits[second];
        this.digits[second] = glass;
    }

    private int digitsToInteger() {
        final StringBuffer buffer = new StringBuffer();

        for (final int digit : this.digits) {
            buffer.append(digit);
        }

        return Integer.valueOf(buffer.toString());
    }

}
