package euler.common;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class NumericTools {

    public static BigInteger factorial(final long number) {
        BigInteger factorial = BigInteger.ONE;

        for (long current = 1; current <= number; ++current) {
            factorial = factorial.multiply(BigInteger.valueOf(current));
        }

        return factorial;
    }

    public static boolean isPalindrome(final int candidate) {
        final char[] chars = String.valueOf(candidate).toCharArray();
        final int count = chars.length / 2;

        for (int index = 0; index < count; ++index) {
            final int first = index;
            final int last = chars.length - index - 1;

            if (chars[first] != chars[last]) {
                return false;
            }
        }

        return true;
    }

    public static List<Long> findDivisors(final long number) {
        final List<Long> factors = new ArrayList<Long>();

        for (long candidate = 1; candidate <= number; ++candidate) {

            if (number % candidate == 0) {
                factors.add(candidate);
            }
        }

        return factors;
    }

    public static int countDivisors(final long number) {
        final List<PrimeWithPower> expressed = NumericTools.expressInPrimes(number);

        int divisors = 1;

        for (final PrimeWithPower primeWithPower : expressed) {
            divisors *= primeWithPower.power + 1;
        }

        return divisors;
    }

    public static long calculateSumOfAllNumbers(final long max) {
        return (max + 1) * max / 2;
    }

    public static boolean isPrime(final long candidate) {

        if (candidate == 1) {
            return false;
        }

        final long half = candidate / 2;

        for (int divisor = 2; divisor <= half; divisor += divisor == 2 ? 1 : 2) {

            if (candidate % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<PrimeWithPower> expressInPrimes(final long number) {
        final List<PrimeWithPower> result = new ArrayList<PrimeWithPower>();

        final PrimesGenerator primesGenerator = new PrimesGenerator();

        long victim = number;

        long prime = primesGenerator.next();
        long power = 0;

        while (victim > 1) {

            if (victim % prime == 0) {
                ++power;

                victim = victim / prime;
            } else {

                if (power != 0) {
                    final PrimeWithPower primeWithPower = new PrimeWithPower(prime, power);
                    result.add(primeWithPower);
                }

                prime = primesGenerator.next();
                power = 0;
            }
        }

        final PrimeWithPower primeWithPower = new PrimeWithPower(prime, power);
        result.add(primeWithPower);

        return result;
    }

    private NumericTools() {
        // empty
    }

}
