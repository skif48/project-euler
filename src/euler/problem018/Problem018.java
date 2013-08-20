package euler.problem018;

import euler.common.Problem;

public class Problem018 implements Problem {

    private final RouteMeasurer measurer;
    private final RouteGenerator generator;

    public Problem018(final byte[][] data) {
        this.measurer = new RouteMeasurer(data);
        this.generator = new RouteGenerator(data.length - 1);
    }

    @Override
    public long solve() {
        int max = 0;

        byte[] route = generator.next();

        while (route != null) {
            final byte[] absolute = RouteTools.convertToAbsolute(route);
            final int length = measurer.measure(absolute);

            max = Math.max(max, length);

            route = generator.next();
        }

        return max;
    }

}
