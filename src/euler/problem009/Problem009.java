package euler.problem009;

import euler.common.Problem;

public class Problem009 implements Problem {

    private static final int PERIMETER = 1000;

    @Override
    public long solve() {

        for (int a = 1; a < 1000; ++a) {
            final int numerator = PERIMETER * PERIMETER - 2 * PERIMETER * a;
            final int denominator = 2 * (PERIMETER - a);

            final int b = numerator / denominator;
            final int reminder = numerator % denominator;

            if (reminder == 0 && b > 0 && a > 0 && a < b) {
                final int c = 1000 - a - b;

                return a * b * c;
            }
        }

        return -1;
    }

}
