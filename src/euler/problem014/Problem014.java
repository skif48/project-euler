package euler.problem014;

import euler.common.Problem;

public class Problem014 implements Problem {

    private final long start;

    public Problem014(final long start) {
        this.start = start;
    }

    @Override
    public long solve() {
        long max = 0;
        long number = 0;

        final CacheableGollatzSequenceMeasurer measurer = new CacheableGollatzSequenceMeasurer();

        for (long current = this.start; current > 0; --current) {
            final long sequenceLength = measurer.calculateLength(current);

            if (sequenceLength > max) {
                max = sequenceLength;
                number = current;
            }
        }

        return number;
    }

}
