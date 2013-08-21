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
        measures[0] = this.data[0][0];

        for (int index = 1; index < data.length; ++index) {
            final byte value = this.data[index][route[index - 1]];
            measures[index] = measures[index - 1] + value;
        }

        return measures[measures.length - 1];
    }

}
