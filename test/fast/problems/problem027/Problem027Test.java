package fast.problems.problem027;

import euler.problem027.Problem027;
import org.junit.Assert;
import org.junit.Test;

public class Problem027Test {

    @Test
    public void smoke() {
        Assert.assertEquals(-59231, new Problem027(1000).solve());
    }

    @Test
    public void countPrimes() {
        final Problem027 problem = new Problem027(50);

        Assert.assertEquals(40, problem.countPrimes(1, 41));
        Assert.assertEquals(80, problem.countPrimes(-79, 1601));
    }

}
