package fast.problems.problem005;

import euler.problem005.Problem005;
import org.junit.Assert;
import org.junit.Test;

public class Problem005Test {

    @Test
    public void smoke() {
        Assert.assertEquals(2520, new Problem005(10).solve());
    }

}
