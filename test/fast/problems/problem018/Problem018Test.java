package fast.problems.problem018;

import euler.problem018.Problem018;
import org.junit.Assert;
import org.junit.Test;

public class Problem018Test {

    @Test
    public void smoke() {
        Assert.assertEquals(23, new Problem018(new byte[][]{{3, 0, 0, 0}, {7, 4, 0, 0}, {2, 4, 6, 0}, {8, 5, 9, 3}}).solve());
    }

}
