package fast.problems.problem026;

import euler.problem026.Problem026;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem026Test {

    @Test
    public void smoke() {
        Assert.assertEquals(7, new Problem026(10).solve());
    }

    @Test
    public void makeGreater() {
        Assert.assertEquals(10, Problem026.makeGreater(1, 7));
        Assert.assertEquals(100, Problem026.makeGreater(1, 70));
    }

    @Test
    public void findRecurringCycle() throws Exception {
        assertRecurringCycleIs(1);
        assertRecurringCycleIs(2);
        assertRecurringCycleIs(3, 3);
        assertRecurringCycleIs(4);
        assertRecurringCycleIs(5);
        assertRecurringCycleIs(6, 6);
        assertRecurringCycleIs(7, 1, 4, 2, 8, 5, 7);
        assertRecurringCycleIs(8);
        assertRecurringCycleIs(9, 1);
        assertRecurringCycleIs(10);
    }

    private void assertRecurringCycleIs(final int number, int... elements) {
        final List<Integer> cycle = Problem026.findRecurringCycle(number);

        assertEquals(elements.length, cycle.size());

        for (int element : elements) {
            assertTrue(cycle.contains(element));
        }
    }

}
