package euler.problem006;

import euler.common.Problem;

public class Problem006 implements Problem {

    private final int count;

    public Problem006(final int count) {
        this.count = count;
    }

    @Override
    public long solve() {
        final long sumOfSquares = (count * (count + 1) * (2 * count + 1)) / 6;
        final long sum = ((count + 1) * count) / 2;

        return sum * sum - sumOfSquares;
    }

}
