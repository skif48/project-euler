package fast.common.numeric;

import euler.common.NumericTools;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class FactorialTest {

    @Test
    public void smoke() {
        Assert.assertEquals(BigInteger.valueOf(2), NumericTools.factorial(2));
        Assert.assertEquals(BigInteger.valueOf(6), NumericTools.factorial(3));
        Assert.assertEquals(BigInteger.valueOf(24), NumericTools.factorial(4));
        Assert.assertEquals(BigInteger.valueOf(120), NumericTools.factorial(5));
    }

}
