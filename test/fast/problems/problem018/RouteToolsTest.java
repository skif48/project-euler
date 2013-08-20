package fast.problems.problem018;

import euler.problem018.RouteTools;
import org.junit.Assert;
import org.junit.Test;

public class RouteToolsTest {

    @Test
    public void routeConversion() {
        final byte[] route = new byte[]{0, 1, 0};

        final byte[] absolute = RouteTools.convertToAbsolute(route);

        Assert.assertEquals(0, absolute[0]);
        Assert.assertEquals(1, absolute[1]);
        Assert.assertEquals(1, absolute[2]);
    }

    @Test
    public void whenRoutesAreTheSameThenMinusOneReturns() {
        final byte[] previous = new byte[] {1, 2, 3};
        final byte[] current = new byte[] {1, 2, 3};

        Assert.assertEquals(-1, RouteTools.findFirstDifference(previous, current));
    }

    @Test
    public void whenRoutesAreNotTheSameThenIndexOfFirstDifferenceReturns() {
        final byte[] previous = new byte[] {1, 2, 3};
        final byte[] current = new byte[] {1, 4, 3};

        Assert.assertEquals(1, RouteTools.findFirstDifference(previous, current));
    }

}
