package euler.problem004;

import euler.common.NumericTools;
import euler.common.Problem;

public class Problem004 implements Problem {

    private final int start;
    private final int stop;

    public Problem004(final int start, final int stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public long solve() {
        int max = 0;

        for (int first = this.stop; first > this.start; --first) {

            for (int second = this.stop; second > this.start; --second) {
                final int value = first * second;

                if (NumericTools.isPalindrome(value)) {
                    max = max > value ? max : value;
                }
            }
        }

        return max;
    }

}
