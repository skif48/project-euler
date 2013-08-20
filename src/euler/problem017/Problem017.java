package euler.problem017;

import euler.common.Problem;

public class Problem017 implements Problem {

    @Override
    public long solve() {
        int sum = 0;

        for (int number = 1; number < 1000; ++number) {
            final String asText = NumberToTextConverter.toText(number);

            sum += asText.length();
        }

        return sum + "onethousand".length();
    }


}
