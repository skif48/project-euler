package fast.problems.problem006;

import euler.problem006.Problem006;
import org.junit.Assert;
import org.junit.Test;

public class Problem006Test {

    @Test
    public void smoke() {
        Assert.assertEquals(2640, new Problem006(10).solve());
    }

}
