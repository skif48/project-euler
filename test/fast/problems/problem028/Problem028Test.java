package fast.problems.problem028;

import euler.problem028.Problem028;
import org.junit.Assert;
import org.junit.Test;

public class Problem028Test {

    @Test
    public void smoke() {
        Assert.assertEquals(101, new Problem028(5).solve());

        Assert.assertEquals(261, new Problem028(7).solve());

        Assert.assertEquals(101, new Problem028(1001).solve());
    }

    @Test
    public void edgeSize() {
        Assert.assertEquals(3, Problem028.getEdgeSize(1));
        Assert.assertEquals(5, Problem028.getEdgeSize(2));
        Assert.assertEquals(7, Problem028.getEdgeSize(3));
    }

    @Test
    public void beginElement() {
        Assert.assertEquals(2, Problem028.getBeginElement(1));
        Assert.assertEquals(10, Problem028.getBeginElement(2));
        Assert.assertEquals(26, Problem028.getBeginElement(3));
    }

    @Test
    public void cornerElements() {
        Assert.assertEquals(3, Problem028.getCornerElement(1, 1));
        Assert.assertEquals(5, Problem028.getCornerElement(1, 2));
        Assert.assertEquals(7, Problem028.getCornerElement(1, 3));
        Assert.assertEquals(9, Problem028.getCornerElement(1, 4));

        Assert.assertEquals(13, Problem028.getCornerElement(2, 1));
        Assert.assertEquals(17, Problem028.getCornerElement(2, 2));
        Assert.assertEquals(21, Problem028.getCornerElement(2, 3));
        Assert.assertEquals(25, Problem028.getCornerElement(2, 4));

        Assert.assertEquals(31, Problem028.getCornerElement(3, 1));
        Assert.assertEquals(17, Problem028.getCornerElement(2, 2));
        Assert.assertEquals(21, Problem028.getCornerElement(2, 3));
        Assert.assertEquals(25, Problem028.getCornerElement(2, 4));
    }
}
