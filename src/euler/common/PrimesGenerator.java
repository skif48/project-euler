package euler.common;

import static euler.common.NumericTools.isPrime;

public class PrimesGenerator {

    private int increment[];
    private int incrementIndex;
    private int candidate;

    public PrimesGenerator() {
        this.increment = new int[] {2, 2, 2, 2};
        this.incrementIndex = -1;
        this.candidate = 2;
    }

    public long next() {

        while (!isPrime(this.candidate)) {
            nextCandidate();
        }

        final int result = this.candidate;

        nextCandidate();

        return result;
    }

    private void nextCandidate() {

        if (this.candidate != 2) {

            if (this.incrementIndex == increment.length - 1) {
                increment[1] = 4;
                this.incrementIndex = 0;
            } else {
                ++this.incrementIndex;
            }
        }

        this.candidate = this.candidate == 2 ? this.candidate + 1 : this.candidate + increment[this.incrementIndex];
    }

}
