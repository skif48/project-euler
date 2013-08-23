package euler.problem026;

import euler.common.Problem;

import java.util.ArrayList;
import java.util.List;

public class Problem026 implements Problem {

    private final int upperLimit;

    public Problem026(final int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public long solve() {
        int maxRecurringCycleLength = 0;
        int denominator = 0;

        for (int candidate = 1; candidate < this.upperLimit; ++candidate) {
            final List<Integer> reccuringCycle = findRecurringCycle(candidate);

            if (maxRecurringCycleLength < reccuringCycle.size()) {
                maxRecurringCycleLength = reccuringCycle.size();
                denominator = candidate;
            }
        }

        return denominator;
    }

    public static List<Integer> findRecurringCycle(final int denominator) {
        final List<Integer> dividends = new ArrayList<Integer>();
        final List<Integer> quotients = new ArrayList<Integer>();

        int dividend = makeGreater(1, denominator);

        boolean found = false;
        boolean finished = false;

        while (!found && !finished) {
            dividends.add(dividend);

            final int quotient = dividend / denominator;
            quotients.add(quotient);

            final int remainder = dividend % denominator;

            if (remainder == 0) {
                finished = true;

                continue;
            }

            dividend = makeGreater(remainder, denominator);

            if (dividends.contains(dividend)) {
                found = true;

                continue;
            }
        }

        if (!found) {
            return new ArrayList<Integer>();
        }

        final int index = dividends.indexOf(dividend);

        return quotients.subList(index, quotients.size());
    }

    public static int makeGreater(final int one, final int another) {
        int result = one;

        while (result < another) {
            result *= 10;
        }

        return result;
    }

}
