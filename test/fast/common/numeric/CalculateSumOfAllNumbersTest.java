package fast.common.numeric;

import euler.common.NumericTools;
import org.junit.Assert;
import org.junit.Test;

public class CalculateSumOfAllNumbersTest {

    @Test
    public void smoke() {
        Assert.assertEquals(28, NumericTools.calculateSumOfAllNumbers(7));
        Assert.assertEquals(5050, NumericTools.calculateSumOfAllNumbers(100));
    }

}
