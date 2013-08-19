package fast.problems.problem014;

import euler.problem014.CacheableGollatzSequenceMeasurer;
import org.junit.Assert;
import org.junit.Test;

public class CacheableGollatzSequenceMeasurerTest {

    @Test
    public void smoke() {
        final CacheableGollatzSequenceMeasurer measurer = new CacheableGollatzSequenceMeasurer();

        Assert.assertEquals(8, measurer.calculateLength(20));
        Assert.assertEquals(5, measurer.calculateLength(16));
        Assert.assertEquals(10, measurer.calculateLength(13));

    }
}
