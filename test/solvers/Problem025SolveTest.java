package solvers;

import euler.problem025.Problem025;
import org.junit.Assert;
import org.junit.Test;

public class Problem025SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(4782, new Problem025(1000).solve());
    }

}
