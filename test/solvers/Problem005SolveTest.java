package solvers;

import euler.problem005.Problem005;
import org.junit.Assert;
import org.junit.Test;

public class Problem005SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(232792560, new Problem005(20).solve());
    }

}
