package euler.problem024;

import euler.common.Problem;

import java.util.HashSet;
import java.util.Set;

public class Problem024 implements Problem {

    @Override
    public long solve() {
        final LexicographicPermutationsGenerator generator = new LexicographicPermutationsGenerator(10);

        long permutation = -1;

        for (long counter = 1; counter <= 1000000; ++counter) {
            permutation = generator.next();
        }

        return permutation;
    }

}
