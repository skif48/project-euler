package solvers;

import euler.problem017.Problem017;
import org.junit.Assert;
import org.junit.Test;

public class Problem017SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(21124, new Problem017().solve());
    }

}
