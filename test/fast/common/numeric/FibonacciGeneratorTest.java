package fast.common.numeric;

import euler.common.FibonacciGenerator;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciGeneratorTest {

    @Test
    public void smoke() {
        final FibonacciGenerator generator = new FibonacciGenerator();

        Assert.assertEquals(0, generator.next().intValue());
        Assert.assertEquals(1, generator.next().intValue());
        Assert.assertEquals(1, generator.next().intValue());
        Assert.assertEquals(2, generator.next().intValue());
        Assert.assertEquals(3, generator.next().intValue());
        Assert.assertEquals(5, generator.next().intValue());
        Assert.assertEquals(8, generator.next().intValue());
        Assert.assertEquals(13, generator.next().intValue());
        Assert.assertEquals(21, generator.next().intValue());
        Assert.assertEquals(34, generator.next().intValue());
        Assert.assertEquals(55, generator.next().intValue());
        Assert.assertEquals(89, generator.next().intValue());
        Assert.assertEquals(144, generator.next().intValue());
        Assert.assertEquals(233, generator.next().intValue());
        Assert.assertEquals(377, generator.next().intValue());
        Assert.assertEquals(610, generator.next().intValue());
        Assert.assertEquals(987, generator.next().intValue());
        Assert.assertEquals(1597, generator.next().intValue());
        Assert.assertEquals(2584, generator.next().intValue());
        Assert.assertEquals(4181, generator.next().intValue());
        Assert.assertEquals(6765, generator.next().intValue());
    }

}
