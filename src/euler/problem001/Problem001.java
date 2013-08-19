package euler.problem001;

import euler.common.Problem;

import java.util.HashSet;
import java.util.Set;

public class Problem001 implements Problem {

    private final int upperLimit;

    private final Set<Integer> usedMultipliers;
    private int multipliersSum;

    public Problem001(final int upperLimit) {
        this.upperLimit = upperLimit;

        this.usedMultipliers = new HashSet<Integer>();
        this.multipliersSum = 0;
    }

    @Override
    public long solve() {
        int k = 1;

        while (true) {
            final int multipleOfThree = k * 3;
            final int multipleOfFive = k * 5;

            final boolean multipleOfThreeAcceptable = multipleOfThree < this.upperLimit;
            final boolean multipleOfFiveAcceptable = multipleOfFive < this.upperLimit;

            if (!multipleOfThreeAcceptable && !multipleOfFiveAcceptable) {
                break;
            }

            if (multipleOfThreeAcceptable) {
                addMultiplierToSum(multipleOfThree);
            }

            if (multipleOfFiveAcceptable) {
                addMultiplierToSum(multipleOfFive);
            }

            ++k;
        }

        return this.multipliersSum;
    }

    private void addMultiplierToSum(final int multiplier) {

        if (!this.usedMultipliers.contains(multiplier)) {
            this.usedMultipliers.add(multiplier);
            this.multipliersSum += multiplier;
        }
    }

}
