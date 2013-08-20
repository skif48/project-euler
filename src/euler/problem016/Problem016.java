package euler.problem016;

import euler.common.Problem;

import java.math.BigInteger;

public class Problem016 implements Problem {

    private final int power;

    public Problem016(final int power) {
        this.power = power;
    }

    @Override
    public long solve() {
        int sum = 0;

        BigInteger value = BigInteger.valueOf(2).pow(this.power);

        while (value.compareTo(BigInteger.ONE) > 0) {
            final BigInteger[] divideAndReminder = value.divideAndRemainder(BigInteger.TEN);
            value = divideAndReminder[0];

            final int digit = divideAndReminder[1].intValue();

            sum += digit;
        }

        sum += value.intValue();

        return sum;
    }

}
