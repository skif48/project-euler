package fast.problems.problem011;

import euler.problem011.Problem011;
import org.junit.Assert;
import org.junit.Test;

public class Problem011Test {

    @Test
    public void smoke() {
        Assert.assertEquals(70600674, new Problem011().solve());
    }

}
