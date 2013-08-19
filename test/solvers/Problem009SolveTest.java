package solvers;

import euler.problem009.Problem009;
import org.junit.Assert;
import org.junit.Test;

public class Problem009SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(31875000, new Problem009().solve());
    }

}
