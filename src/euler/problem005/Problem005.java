package euler.problem005;

import euler.common.Problem;

public class Problem005 implements Problem {

    private final int upper;

    public Problem005(final int upper) {
        this.upper = upper;
    }

    @Override
    public long solve() {

        for (int candidate = this.upper; ; candidate += this.upper) {

            if (isEvenlyDivisible(candidate)) {
                return candidate;
            }
        }

    }

    private boolean isEvenlyDivisible(final int candidate) {

        for (int divisor = this.upper - 1; divisor > 2; --divisor) {

            if (candidate % divisor != 0) {
                return false;
            }
        }

        return true;
    }

}
