package euler.problem024;

public class LexicographicPermutationsGenerator {

    private int[] permutation;
    private boolean finished;

    public LexicographicPermutationsGenerator(final int size) {
        this.permutation = new int[size];

        for (int index = 0; index < size; ++index) {
            this.permutation[index] = index;
        }

        this.finished = false;
    }

    public long next() {

        if (this.finished) {
            return -1;
        }

        final long result = permutationToInteger();

        prepareNext();

        return result;
    }

    private void prepareNext() {
        int first = this.permutation.length - 2;

        while (first >= 0 && this.permutation[first] > this.permutation[first + 1]) {
            --first;
        }

        if (first < 0) {
            this.finished = true;

            return;
        }

        int second = this.permutation.length - 1;

        while (second >= 0 && this.permutation[first] > this.permutation[second]) {
            --second;
        }

        swap(first, second);
        reverse(first + 1, this.permutation.length - 1);
    }

    private void swap(final int first, final int second) {
        final int glass = this.permutation[first];
        this.permutation[first] = this.permutation[second];
        this.permutation[second] = glass;
    }

    private void reverse(final int from, final int to) {
        int first = from;
        int second = to;

        while (second - first >= 1) {
            swap(first, second);

            ++first;
            --second;
        }
    }

    private long permutationToInteger() {
        final StringBuffer buffer = new StringBuffer();

        for (final int digit : this.permutation) {
            buffer.append(digit);
        }

        return Long.valueOf(buffer.toString());
    }

}
