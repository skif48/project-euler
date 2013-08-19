package solvers;

import euler.problem012.Problem012;
import org.junit.Assert;
import org.junit.Test;

public class Problem012SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(76576500, new Problem012(500).solve());
    }

}
