package solvers;

import euler.problem014.Problem014;
import org.junit.Assert;
import org.junit.Test;

public class Problem014SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(837799, new Problem014(1000000).solve());
    }

}
