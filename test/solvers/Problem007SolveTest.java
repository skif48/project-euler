package solvers;

import euler.problem007.Problem007;
import org.junit.Assert;
import org.junit.Test;

public class Problem007SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(104743, new Problem007(10001).solve());
    }

}
