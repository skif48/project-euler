package fast.problems.problem015;

import euler.problem015.Problem015;
import org.junit.Assert;
import org.junit.Test;

public class Problem015Test {

    @Test
    public void smoke() {
        Assert.assertEquals(6, new Problem015(2).solve());
    }

}
