package fast.problems.problem020;

import euler.problem020.Problem020;
import org.junit.Assert;
import org.junit.Test;

public class Problem020Test {

    @Test
    public void smoke() {
        Assert.assertEquals(27, new Problem020(10).solve());
    }

}
