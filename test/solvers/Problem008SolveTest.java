package solvers;

import euler.problem008.Problem008;
import org.junit.Assert;
import org.junit.Test;

public class Problem008SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(40824, new Problem008().solve());
    }

}
