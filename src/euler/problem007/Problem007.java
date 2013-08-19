package euler.problem007;

import euler.common.PrimesGenerator;
import euler.common.Problem;

public class Problem007 implements Problem {

    private final int count;

    public Problem007(final int count) {
        this.count = count;
    }

    @Override
    public long solve() {
        final PrimesGenerator generator = new PrimesGenerator();

        long prime = 0;

        for (int i = 1; i <= this.count; ++i) {
            prime = generator.next();
        }

        return prime;
    }

}
