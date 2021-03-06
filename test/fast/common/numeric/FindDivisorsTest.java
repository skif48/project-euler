package fast.common.numeric;

import euler.common.NumericTools;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindDivisorsTest {

    @Test
    public void smoke() {
        assertDivisorsAre(1, 1);
        assertDivisorsAre(3, 1, 3);
        assertDivisorsAre(6, 1, 2, 3, 6);
        assertDivisorsAre(10, 1, 2, 5, 10);
        assertDivisorsAre(15, 1, 3, 5, 15);
        assertDivisorsAre(21, 1, 3, 7, 21);
        assertDivisorsAre(28, 1, 2, 4, 7, 14, 28);
    }

    private void assertDivisorsAre(final long number, long... factors) {
        final List<Long> divisors = NumericTools.findDivisors(number);

        assertEquals(factors.length, divisors.size());

        for (Long factor : factors) {
            assertTrue(divisors.contains(factor));
        }
    }

}
