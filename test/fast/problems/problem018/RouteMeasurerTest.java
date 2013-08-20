package fast.problems.problem018;

import euler.problem018.RouteMeasurer;
import org.junit.Assert;
import org.junit.Test;

public class RouteMeasurerTest {

    @Test
    public void smoke() {
        final byte[][] data = new byte[][]{{3, 0, 0, 0}, {7, 4, 0, 0}, {2, 4, 6, 0}, {8, 5, 9, 3}};

        final RouteMeasurer measurer = new RouteMeasurer(data);

        Assert.assertEquals(20, measurer.measure(new byte[]{0, 0, 0}));
        Assert.assertEquals(17, measurer.measure(new byte[]{0, 0, 1}));
    }

}
