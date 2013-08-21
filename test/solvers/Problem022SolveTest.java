package solvers;

import euler.problem022.Problem022;
import org.junit.Assert;
import org.junit.Test;

public class Problem022SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(871198282, new Problem022().solve());
    }

}
