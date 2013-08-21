package solvers;

import euler.problem023.Problem023;
import org.junit.Assert;
import org.junit.Test;

public class Problem023SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(4179871, new Problem023().solve());
    }

}
