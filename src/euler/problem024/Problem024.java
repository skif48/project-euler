package euler.problem024;

import euler.common.Problem;

import java.util.HashSet;
import java.util.Set;

public class Problem024 implements Problem {

    @Override
    public long solve() {
        int counter = 0;

        for (long candidate = 123456789; candidate <= 9876543210L; ++candidate) {

            if (containsUniqueDigitsOnly(candidate)) {
                System.out.println(candidate);
                ++counter;
                //System.out.println(++counter);

                if (counter == 10) {
                    return candidate;
                }
            }
        }

        return -1;
    }

    private boolean containsUniqueDigitsOnly(final long number) {
        final char[] digits = String.valueOf(number).toCharArray();
        final Set<Character> set = new HashSet<Character>();

        for (final char digit : digits) {
            set.add(digit);
        }

        if (number < 987654321) {
            set.add('0');
        }

        return set.size() == 10;
    }

}
