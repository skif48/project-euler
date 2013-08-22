package euler.problem026;

import euler.common.PrimesGenerator;
import euler.common.Problem;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Problem026 implements Problem {

    @Override
    public long solve() {
        final PrimesGenerator generator = new PrimesGenerator();

        long previous = 0;

        long current = generator.next();

        while (current < 1000) {
            previous = current;
            current = generator.next();
        }

        BigDecimal one = new BigDecimal(BigInteger.ONE, new MathContext(4));
        BigDecimal denominator = new BigDecimal(BigInteger.valueOf(previous), new MathContext(4));

        System.out.println(one.divide(denominator, 4000, RoundingMode.HALF_UP));
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
