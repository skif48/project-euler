package euler.problem018;

public class RouteMeasurer {

    private final byte[][] data;

    private byte[] previousRoute;
    private int[] previousMeasures;

    public RouteMeasurer(final byte[][] data) {
        this.data = data;
        this.previousRoute = null;
    }

    public int measure(final byte[] route) {
        final int[] measures = new int[route.length + 1];

        final int firstDifference = findFirstDifference(route);

        if (firstDifference == 0) {
            measures[0] = this.data[0][0];
        } else {
            System.arraycopy(this.previousMeasures, 0, measures, 0, firstDifference + 1);
        }

        for (int index = firstDifference + 1; index < data.length; ++index) {
            final byte value = this.data[index][route[index - 1]];
            measures[index] = measures[index - 1] + value;
        }

        this.previousRoute = route;
        this.previousMeasures = measures;

        return measures[measures.length - 1];
    }

    private int findFirstDifference(final byte[] route) {
        return this.previousRoute == null ? 0 : RouteTools.findFirstDifference(this.previousRoute, route);
    }

}
