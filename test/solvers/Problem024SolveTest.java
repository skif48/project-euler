package solvers;

import euler.problem024.Problem024;
import org.junit.Assert;
import org.junit.Test;

public class Problem024SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(2783915460L, new Problem024().solve());
    }

}
