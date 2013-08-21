package fast.problems.problem021;

import euler.problem021.Problem021;
import org.junit.Assert;
import org.junit.Test;

public class Problem021Test {

    @Test
    public void smoke() {
        Assert.assertEquals(31626, new Problem021().solve());
    }
}
