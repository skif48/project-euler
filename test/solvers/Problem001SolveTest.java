package solvers;

import euler.problem001.Problem001;
import org.junit.Assert;
import org.junit.Test;

public class Problem001SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(233168, new Problem001(1000).solve());
    }

}
