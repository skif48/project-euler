package fast.problems.problem024;

import euler.problem024.LexicographicPermutationsGenerator;
import org.junit.Assert;
import org.junit.Test;

public class LexicographicPermutationsGeneratorTest {

    @Test
    public void generateFromTreeDigits() {
        final LexicographicPermutationsGenerator generator = new LexicographicPermutationsGenerator(3);

        Assert.assertEquals(12, generator.next());
        Assert.assertEquals(21, generator.next());
        Assert.assertEquals(102, generator.next());
        Assert.assertEquals(120, generator.next());
        Assert.assertEquals(201, generator.next());
        Assert.assertEquals(210, generator.next());

        Assert.assertEquals(-1, generator.next());
    }

    @Test
    public void generateFromTenDigits() {
        final LexicographicPermutationsGenerator generator = new LexicographicPermutationsGenerator(10);

        Assert.assertEquals(123456789L, generator.next());
        Assert.assertEquals(123456798L, generator.next());
        Assert.assertEquals(123456879L, generator.next());
        Assert.assertEquals(123456897L, generator.next());
        Assert.assertEquals(123456978L, generator.next());
        Assert.assertEquals(123456987L, generator.next());
        Assert.assertEquals(123457689L, generator.next());
        Assert.assertEquals(123457698L, generator.next());
        Assert.assertEquals(123457869L, generator.next());
        Assert.assertEquals(123457896L, generator.next());
    }

}
