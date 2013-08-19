package fast.problems.problem002;

import euler.problem002.Problem002;
import org.junit.Assert;
import org.junit.Test;

public class Problem002Test {

    @Test
    public void smoke() {
        Assert.assertEquals(44, new Problem002(89).solve());
    }

}
