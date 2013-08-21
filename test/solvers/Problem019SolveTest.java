package solvers;

import euler.problem019.Problem019;
import org.junit.Assert;
import org.junit.Test;

public class Problem019SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(171, new Problem019().solve());
    }

}
