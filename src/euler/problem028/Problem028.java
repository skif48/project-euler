package euler.problem028;

import euler.common.Problem;

public class Problem028 implements Problem {

    private final long maxEdgeSize;

    public Problem028(final long maxEdgeSize) {
        this.maxEdgeSize = maxEdgeSize;
    }

    @Override
    public long solve() {
        long step = 1;
        long sum = 1;

        long edgeSize = getEdgeSize(step);

        while (edgeSize <= this.maxEdgeSize) {
            sum += getCornerElement(step, 1);
            sum += getCornerElement(step, 2);
            sum += getCornerElement(step, 3);
            sum += getCornerElement(step, 4);

            edgeSize = getEdgeSize(++step);
        }

        return sum;
    }

    public static long getEdgeSize(final long step) {
        return 2 * (step - 1) + 3;
    }

    public static long getBeginElement(final long step) {
       // 4 + 4 * (1 + 2 * (step - 2));
        return 4 * (3 + 2 * (step - 2));
    }

    public static long getCornerElement(final long step, final long corner) {
        final long beginElement = getBeginElement(step);

        return beginElement + corner * (1 + 2 * (step - 1)) + corner - 1;
    }
}
