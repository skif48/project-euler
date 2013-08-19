package fast.problems.problem001;

import euler.problem001.Problem001;
import org.junit.Assert;
import org.junit.Test;

public class Problem001Test {

    @Test
    public void smoke() {
        Assert.assertEquals(23, new Problem001(10).solve());
    }

}
