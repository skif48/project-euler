package fast.problems.problem017;

import euler.problem017.NumberToTextConverter;
import org.junit.Assert;
import org.junit.Test;

public class NumberToTextConverterTest {

    @Test
    public void smoke() {
        Assert.assertEquals("one", NumberToTextConverter.toText(1));
        Assert.assertEquals("ten", NumberToTextConverter.toText(10));
        Assert.assertEquals("twelve", NumberToTextConverter.toText(12));
        Assert.assertEquals("fortytwo", NumberToTextConverter.toText(42));
        Assert.assertEquals("twohundredandfortyeight", NumberToTextConverter.toText(248));
        Assert.assertEquals("threehundredandfortytwo", NumberToTextConverter.toText(342));
        Assert.assertEquals("onehundredandfifteen", NumberToTextConverter.toText(115));
        Assert.assertEquals("onehundred", NumberToTextConverter.toText(100));
        Assert.assertEquals("onehundredandfive", NumberToTextConverter.toText(105));
    }

}
