package fast.common.numeric;

import org.junit.Assert;
import org.junit.Test;

import static euler.common.NumericTools.countDivisors;

public class CountDivisorsTest {

    @Test
    public void smoke() {
        Assert.assertEquals(1, countDivisors(1));
        Assert.assertEquals(2, countDivisors(3));
        Assert.assertEquals(4, countDivisors(6));
        Assert.assertEquals(4, countDivisors(10));
        Assert.assertEquals(4, countDivisors(15));
        Assert.assertEquals(4, countDivisors(21));
        Assert.assertEquals(6, countDivisors(28));
    }

    @Test
    public void troubles() {
        Assert.assertEquals(4, countDivisors(1081));
    }

}
