package solvers;

import euler.problem015.Problem015;
import org.junit.Assert;
import org.junit.Test;

public class Problem015SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(137846528820L, new Problem015(20).solve());
    }

}
