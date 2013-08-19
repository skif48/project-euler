package fast.problems.problem010;

import euler.problem010.Problem010;
import org.junit.Assert;
import org.junit.Test;

public class Problem010Test {

    @Test
    public void smoke() {
        Assert.assertEquals(17, new Problem010(10).solve());
    }

}
