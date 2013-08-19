package fast.common.numeric;

import euler.common.NumericTools;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindDivisorsTest {

    @Test
    public void smoke() {
        assertNumberFactorsAre(1, 1);
        assertNumberFactorsAre(3, 1, 3);
        assertNumberFactorsAre(6, 1, 2, 3, 6);
        assertNumberFactorsAre(10, 1, 2, 5, 10);
        assertNumberFactorsAre(15, 1, 3, 5, 15);
        assertNumberFactorsAre(21, 1, 3, 7, 21);
        assertNumberFactorsAre(28, 1, 2, 4, 7, 14, 28);
    }

    private void assertNumberFactorsAre(final long number, long ... factors) {
        final List<Long> foundFactors = NumericTools.findDivisors(number);

        assertEquals(factors.length, foundFactors.size());

        for (Long factor : factors) {
            assertTrue(foundFactors.contains(factor));
        }
    }

}
