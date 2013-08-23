package solvers;

import euler.problem027.Problem027;
import org.junit.Assert;
import org.junit.Test;

public class Problem027SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(-59231, new Problem027(1000).solve());
    }

}
