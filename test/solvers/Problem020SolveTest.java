package solvers;

import euler.problem020.Problem020;
import org.junit.Assert;
import org.junit.Test;

public class Problem020SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(27, new Problem020(100).solve());
    }

}
