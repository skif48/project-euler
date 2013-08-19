package fast.problems.problem003;

import euler.problem003.Problem003;
import org.junit.Assert;
import org.junit.Test;

public class Problem003Test {

    @Test
    public void smoke() {
        Assert.assertEquals(29, new Problem003(13195).solve());
    }

}
