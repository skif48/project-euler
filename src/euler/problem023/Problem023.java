package euler.problem023;

import euler.common.NumericTools;
import euler.common.Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem023 implements Problem {

    private static final int UPPER_LIMIT = 28123;

    @Override
    public long solve() {
        final List<Integer> abundantNumbers = createAbundantNumbersList();

        final Set<Integer> possibleSums = calculatePossibleSums(abundantNumbers);

        int sumOfNonAbundantNumbers = 0;

        for (int number = 1; number <= UPPER_LIMIT; ++number) {

            if (!possibleSums.contains(number)) {
                sumOfNonAbundantNumbers += number;
            }
        }

        return sumOfNonAbundantNumbers;
    }

    private Set<Integer> calculatePossibleSums(List<Integer> abundantNumbers) {
        final Set<Integer> possibleSums = new HashSet<Integer>();

        for (int first = 0; first < abundantNumbers.size() - 1; ++first) {

            for (int second = first; second < abundantNumbers.size(); ++second) {
                possibleSums.add(abundantNumbers.get(first) + abundantNumbers.get(second));
            }
        }
        return possibleSums;
    }

    private List<Integer> createAbundantNumbersList() {
        final List<Integer> abundantNumbers = new ArrayList<Integer>();

        for (int candidate = 1; candidate <= UPPER_LIMIT; ++candidate) {
            final long sumOfProperDivisors = calculateSumOfProperDivisors(candidate);
            final boolean isAbundant = sumOfProperDivisors > candidate;

            if (isAbundant) {
                abundantNumbers.add(candidate);
            }
        }

        return abundantNumbers;
    }

    private long calculateSumOfProperDivisors(final int number) {
        long sum = 0;

        final List<Long> divisors = NumericTools.findProperDivisors(number);

        for (final Long divisor : divisors) {
            sum += divisor;
        }

        return sum;
    }

}
