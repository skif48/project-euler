package euler.problem027;

import euler.common.NumericTools;
import euler.common.PrimesGenerator;
import euler.common.Problem;

import java.util.HashSet;
import java.util.Set;

public class Problem027 implements Problem {

    private final long upperLimit;

    private final Set<Long> primes;

    private int maxPrimes;
    private long bestA;
    private long bestB;

    public Problem027(final long upperLimit) {
        this.upperLimit = upperLimit;

        this.primes = new HashSet<Long>();
    }

    @Override
    public long solve() {
        resetResult();

        final PrimesGenerator generator = new PrimesGenerator();

        long b = generator.next();

        while (b < this.upperLimit) {

            for (long a = 0; a < this.upperLimit; ++a) {
                updateResult(a, b);
                updateResult(-a, b);
                updateResult(-a, -b);
                updateResult(a, -b);
            }

            b = generator.next();
        }

        return this.bestA * this.bestB;
    }

    public int countPrimes(final long a, final long b) {
        int n;

        for (n = 0; n < 1000000; ++n) {
            final long candidate = n * n + a * n + b;

            if (candidate < 0 || !isPrime(candidate)) {
                break;
            }
        }

        return n;
    }

    private void resetResult() {
        this.maxPrimes = 0;
        this.bestA = 0;
        this.bestB = 0;
    }

    private void updateResult(final long a, final long b) {
        final int primes = countPrimes(a, b);

        if (primes > this.maxPrimes) {
            this.maxPrimes = primes;
            this.bestA = a;
            this.bestB = b;
        }
    }

    private boolean isPrime(final long candidate) {

        if (this.primes.contains(candidate)) {
            return true;
        }

        if (NumericTools.isPrime(candidate)) {
            this.primes.add(candidate);

            return true;
        }

        return false;
    }


}
