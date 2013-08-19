package fast.problems.problem012;

import euler.problem012.Problem012;
import org.junit.Assert;
import org.junit.Test;

public class Problem012Test {

    @Test
    public void smoke() {
        Assert.assertEquals(28, new Problem012(5).solve());
    }

}
