package euler.problem003;

import euler.common.NumericTools;
import euler.common.Problem;

public class Problem003 implements Problem {

    private final long start;

    public Problem003(final long start) {
        this.start = start;
    }

    @Override
    public long solve() {
        int odd = 3;

        while (this.start / odd > 1) {

            if (this.start % odd == 0) {
                long value = this.start / odd;

                if (NumericTools.isPrime(value)) {
                    return value;
                }
            }

            odd += 2;
        }

        return -1;
    }

}
