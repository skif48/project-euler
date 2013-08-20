package fast.problems.problem016;

import euler.problem016.Problem016;
import org.junit.Assert;
import org.junit.Test;

public class Problem016Test {

    @Test
    public void smoke() {
        Assert.assertEquals(26, new Problem016(15).solve());
    }

}
