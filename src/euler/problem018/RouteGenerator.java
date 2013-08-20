package euler.problem018;

import java.math.BigInteger;
import java.util.Arrays;

public class RouteGenerator {

    private final int length;
    private final BigInteger max;

    private BigInteger current;

    public RouteGenerator(final int length) {
        this.length = length;
        this.max = BigInteger.valueOf(2).pow(length).subtract(BigInteger.ONE);

        this.current = BigInteger.ZERO;
    }

    public byte[] next() {

        if (this.current.compareTo(this.max) > 0) {
            return null;
        }

        final String binary = this.current.toString(2);

        this.current = this.current.add(BigInteger.ONE);

        return convertToArray(binary);
    }

    private byte[] convertToArray(String binary) {
        final byte[] result = new byte[this.length];
        Arrays.fill(result, (byte) 0);

        final int binaryLength = binary.length();

        for (int index = 0; index < binaryLength; ++index) {
            final int indexFromStringEnd = binaryLength - index - 1;
            final String digit = binary.substring(indexFromStringEnd, indexFromStringEnd + 1);

            final int arrayIndex = result.length - index - 1;

            result[arrayIndex] = Byte.valueOf(digit);
        }

        return result;
    }

}
