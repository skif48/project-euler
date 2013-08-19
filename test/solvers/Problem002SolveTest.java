package solvers;

import euler.problem002.Problem002;
import euler.problem012.Problem012;
import org.junit.Assert;
import org.junit.Test;

public class Problem002SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(4613732, new Problem002(4000000).solve());
    }

}
