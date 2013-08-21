package fast.common.numeric;

import euler.common.NumericTools;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindProperDivisorsTest {

    @Test
    public void smoke() {
        assertDivisorsAre(1);
        assertDivisorsAre(3, 1);
        assertDivisorsAre(6, 1, 2, 3);
        assertDivisorsAre(10, 1, 2, 5);
        assertDivisorsAre(15, 1, 3, 5);
        assertDivisorsAre(21, 1, 3, 7);
        assertDivisorsAre(28, 1, 2, 4, 7, 14);
    }

    private void assertDivisorsAre(final long number, long... factors) {
        final List<Long> divisors = NumericTools.findProperDivisors(number);

        assertEquals(factors.length, divisors.size());

        for (Long factor : factors) {
            assertTrue(divisors.contains(factor));
        }
    }

}
