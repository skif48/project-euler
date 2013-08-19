package fast.problems.problem004;

import euler.problem004.Problem004;
import org.junit.Assert;
import org.junit.Test;

public class Problem004Test {

    @Test
    public void smoke() {
        Assert.assertEquals(9009, new Problem004(10, 99).solve());
    }

}
