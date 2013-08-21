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
    }

    /*
    0123456789
    0123456798
    0123456879
    0123456897
    0123456978
    0123456987
    0123457689
    0123457698
    0123457869
    0123457896
     */
}
