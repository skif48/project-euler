package euler.problem002;

import euler.common.FibonacciGenerator;
import euler.common.Problem;

public class Problem002 implements Problem {

    private final int upperLimit;

    public Problem002(final int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public long solve() {
        final FibonacciGenerator generator = new FibonacciGenerator();
        generator.next();

        int sum = 0;

        while (true) {
            generator.next();
            generator.next();

            int even = generator.next();

            if (even >= this.upperLimit) {
                break;
            }

            sum += even;
        }

        return sum;
    }

}
