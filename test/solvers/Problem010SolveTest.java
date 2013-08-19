package solvers;

import euler.problem010.Problem010;
import org.junit.Assert;
import org.junit.Test;

public class Problem010SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(142913828922L, new Problem010(2000000).solve());
    }

}
