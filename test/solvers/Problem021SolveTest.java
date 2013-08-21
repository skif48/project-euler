package solvers;

import euler.problem021.Problem021;
import org.junit.Assert;
import org.junit.Test;

public class Problem021SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(31626, new Problem021().solve());
    }
}
