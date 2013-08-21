package euler.problem022;

import euler.common.Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem022 implements Problem {

    @Override
    public long solve() {
        long sum = 0;

        final String[] splitted = Problem022Data.DUMP.split(",");

        final List<String> names = new ArrayList<String>(splitted.length);

        for (final String current : splitted) {
            names.add(current.substring(1, current.length() - 1));
        }

        Collections.sort(names);

        int index = 1;

        for (final String name : names) {
            final int letterScorePart = calculateLetterScorePart(name);
            final int score = letterScorePart * (index++);

            sum += score;
        }

        return sum;
    }

    private int calculateLetterScorePart(final String name) {
        int sum = 0;

        for (final char letter : name.toCharArray()) {
            final int letterNumber = letter - 64;
            sum += letterNumber;
        }

        return sum;
    }

}
