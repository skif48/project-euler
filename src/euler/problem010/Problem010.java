package euler.problem010;

import euler.common.PrimesGenerator;
import euler.common.Problem;

public class Problem010 implements Problem {

    private final int maximum;

    public Problem010(final int maximum) {
        this.maximum = maximum;
    }

    @Override
    public long solve() {
        long sum = 0;

        final PrimesGenerator generator = new PrimesGenerator();

        while (true) {
            final long prime = generator.next();

            if (prime > this.maximum) {
                return sum;
            }

            sum += prime;
        }
    }

}
