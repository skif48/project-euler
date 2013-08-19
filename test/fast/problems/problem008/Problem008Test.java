package fast.problems.problem008;

import euler.problem008.Problem008;
import org.junit.Assert;
import org.junit.Test;

public class Problem008Test {

    @Test
    public void smoke() {
        Assert.assertEquals(40824, new Problem008().solve());
    }

}
