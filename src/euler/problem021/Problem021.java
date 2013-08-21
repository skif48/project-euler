package euler.problem021;

import euler.common.NumericTools;
import euler.common.Problem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem021 implements Problem {

    @Override
    public long solve() {
        final Map<Long, Long> numberToSum = buildMaps();

        long sum = 0;

        for (final Long current : numberToSum.keySet()) {
            final Long candidate = numberToSum.get(current);

            if (candidate.equals(current)) {
                continue;
            }

            final Long candidateSum = numberToSum.get(candidate);

            if (current.equals(candidateSum)) {
                sum += current;
            }
        }

        return sum;
    }

    private Map<Long, Long> buildMaps() {
        final Map<Long, Long> numberToSum = new HashMap<Long, Long>();

        for (long number = 1; number < 10000; ++number) {
            final List<Long> divisors = NumericTools.findDivisors(number);

            long sum = 0;

            for (int index = 0; index < divisors.size() - 1; ++index) {
                sum += divisors.get(index);
            }

            numberToSum.put(number, sum);
        }

        return numberToSum;
    }

}
