package fast.problems.problem025;

import euler.problem025.Problem025;
import org.junit.Assert;
import org.junit.Test;

public class Problem025Test {

    @Test
    public void smoke() {
        Assert.assertEquals(12, new Problem025(3).solve());
    }

}
