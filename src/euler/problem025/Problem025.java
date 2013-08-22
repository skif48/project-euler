package euler.problem025;

import euler.common.FibonacciGenerator;
import euler.common.Problem;

public class Problem025 implements Problem {

    private final int digitsCount;

    public Problem025(final int digitsCount) {
        this.digitsCount = digitsCount;
    }

    @Override
    public long solve() {
        final FibonacciGenerator generator = new FibonacciGenerator();

        int counter = 0;

        while (true) {
            final String asString = generator.next().toString();
            final int digitsCount = asString.length();

            if (digitsCount >= this.digitsCount) {
                return counter;
            }

            ++counter;
        }
    }

}
