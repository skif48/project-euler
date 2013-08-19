package fast.problems.problem013;

import euler.problem013.Problem013;
import org.junit.Assert;
import org.junit.Test;

public class Problem013Test {

    @Test
    public void smoke() {
        Assert.assertEquals(5537376230L, new Problem013().solve());
    }

}
