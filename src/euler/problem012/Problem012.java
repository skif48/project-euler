package euler.problem012;

import euler.common.NumericTools;
import euler.common.Problem;

import java.util.List;
import java.util.logging.Logger;

public final class Problem012 implements Problem {

    private final int numberOfDivisors;

    public Problem012(final int numberOfDivisors) {
        this.numberOfDivisors = numberOfDivisors;
    }

    @Override
    public long solve() {

        for (int index = calcStartIndex(); ; ++index) {
            final long triangleNumber = NumericTools.calculateSumOfAllNumbers(index);
            final long divisors = NumericTools.countDivisors(triangleNumber);

            if (divisors > this.numberOfDivisors) {
                return triangleNumber;
            }
        }
    }

    private int calcStartIndex() {
        return 2 * (int) Math.sqrt(this.numberOfDivisors);
    }

}
