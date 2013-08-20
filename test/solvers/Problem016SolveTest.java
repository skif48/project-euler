package solvers;

import euler.problem016.Problem016;
import org.junit.Assert;
import org.junit.Test;

public class Problem016SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(1366, new Problem016(1000).solve());
    }

}
