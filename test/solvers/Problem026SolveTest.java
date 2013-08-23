package solvers;

import euler.problem026.Problem026;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem026SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(983, new Problem026(1000).solve());
    }

}
