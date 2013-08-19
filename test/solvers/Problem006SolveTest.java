package solvers;

import euler.problem006.Problem006;
import org.junit.Assert;
import org.junit.Test;

public class Problem006SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(25164150, new Problem006(100).solve());
    }

}
