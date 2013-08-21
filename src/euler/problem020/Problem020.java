package euler.problem020;

import euler.common.NumericTools;
import euler.common.Problem;

import java.math.BigInteger;

public class Problem020 implements Problem {

    private final int number;

    public Problem020(final int number) {
        this.number = number;
    }

    @Override
    public long solve() {
        final BigInteger factorial = NumericTools.factorial(this.number);
        final char[] digits = factorial.toString().toCharArray();

        long sum = 0;

        for (final char digit : digits) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }

}
