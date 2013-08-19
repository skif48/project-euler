package fast.problems.problem007;

import euler.problem007.Problem007;
import org.junit.Assert;
import org.junit.Test;

public class Problem007Test {

    @Test
    public void smoke() {
        Assert.assertEquals(13, new Problem007(6).solve());
    }

}
