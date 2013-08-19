package fast.common.numeric;

import euler.common.NumericTools;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPrimeTest {

    @Test
    public void smoke() {
        assertFalse(NumericTools.isPrime(1));
        assertTrue(NumericTools.isPrime(2));
        assertTrue(NumericTools.isPrime(3));
        assertFalse(NumericTools.isPrime(4));
    }

}
