package euler.problem021;

import euler.common.NumericTools;
import euler.common.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem021 implements Problem {

    private final Map<Long, List<Long>> sumToNumbers;
    private final  Map<Long, Long> numberToSum;

    public Problem021() {
        this.sumToNumbers = new HashMap<Long, List<Long>>();
        this.numberToSum = new HashMap<Long, Long>();

        buildMaps();
    }

    @Override
    public long solve() {
        long sum = 0;

        for (final Long current : this.numberToSum.keySet()) {
            final Long candidate = this.numberToSum.get(current);

            if (candidate.equals(current)) {
                continue;
            }

            final Long candidateSum = this.numberToSum.get(candidate);

            if (current.equals(candidateSum)) {
                sum += current;
            }
        }

        return sum;
    }

    private void buildMaps() {

        for (long number = 1; number < 10000; ++number) {
            final List<Long> divisors = NumericTools.findDivisors(number);

            long sum = 0;

            for (int index = 0; index < divisors.size() - 1; ++index) {
                sum += divisors.get(index);
            }

            List<Long> numbers = getNumbersListForThisSum(sum);
            numbers.add(number);

            numberToSum.put(number, sum);
        }
    }

    private List<Long> getNumbersListForThisSum(long sum) {
        List<Long> numbers = this.sumToNumbers.get(sum);

        if (numbers == null) {
            numbers = new ArrayList<Long>();
            this.sumToNumbers.put(sum, numbers);
        }

        return numbers;
    }

}
