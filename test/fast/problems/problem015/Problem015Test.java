package fast.problems.problem015;

import euler.problem015.Problem015;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author : Igor Usenko ( igors48@gmail.com )
 * Date : 19.08.13
 */
public class Problem015Test {

    @Test
    public void smoke() {
        Assert.assertEquals(6, new Problem015(4).solve());
    }

}
