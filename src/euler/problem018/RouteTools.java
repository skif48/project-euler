package euler.problem018;

public class RouteTools {

    public static byte[] convertToAbsolute(final byte[] route) {
        final byte[] result = new byte[route.length];

        byte offset = 0;
        int index = 0;

        for(final byte element : route) {
            offset += element;

            result[index] = offset;

            ++index;
        }

        return result;
    }

    public static byte findFirstDifference(final byte[] previous, final byte[] current) {
        byte index = 0;

        for (final byte value : current) {

            if (value != previous[index]) {
                return index;
            }

            ++index;
        }

        return -1;
    }

    private RouteTools() {
        // empty
    }

}
