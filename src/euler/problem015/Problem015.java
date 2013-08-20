package euler.problem015;

import euler.common.NumericTools;
import euler.common.Problem;

import java.math.BigInteger;

public class Problem015 implements Problem {

    private final long size;

    public Problem015(final long size) {
        this.size = size;
    }

    @Override
    public long solve() {
        final BigInteger factorialFromSize = NumericTools.factorial(this.size);
        final BigInteger square = factorialFromSize.multiply(factorialFromSize);

        final BigInteger factorialFromDoubleSize = NumericTools.factorial(this.size * 2);

        final BigInteger routeCount = factorialFromDoubleSize.divide(square);

        return routeCount.longValue();
    }

}
