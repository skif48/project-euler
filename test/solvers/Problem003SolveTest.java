package solvers;

import euler.problem003.Problem003;
import org.junit.Assert;
import org.junit.Test;

public class Problem003SolveTest {

    @Test
    public void smoke() {
        Assert.assertEquals(6857, new Problem003(600851475143L).solve());
    }

}
