package solvers;

import euler.problem004.Problem004;
import org.junit.Assert;
import org.junit.Test;

public class Problem004SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(906609, new Problem004(300, 999).solve());
    }

}
