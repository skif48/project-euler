package fast.common.numeric;

import euler.common.NumericTools;
import euler.common.PrimeWithPower;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ExpressInPrimesTest {

    @Test
    public void smoke() {
        List<PrimeWithPower> result = NumericTools.expressInPrimes(2);

        Assert.assertEquals(1, result.size());
        Assert.assertEquals(new PrimeWithPower(2, 1), result.get(0));

        result = NumericTools.expressInPrimes(5);

        Assert.assertEquals(1, result.size());
        Assert.assertEquals(new PrimeWithPower(5, 1), result.get(0));

        result = NumericTools.expressInPrimes(6);

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(new PrimeWithPower(2, 1), result.get(0));
        Assert.assertEquals(new PrimeWithPower(3, 1), result.get(1));
    }

}
