package fast.problems.problem022;

import euler.problem022.Problem022;
import org.junit.Assert;
import org.junit.Test;

public class Problem022Test {

    @Test
    public void smoke() {
        Assert.assertEquals(871198282, new Problem022().solve());
    }

}
