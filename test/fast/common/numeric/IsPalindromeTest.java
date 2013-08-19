package fast.common.numeric;

import euler.common.NumericTools;
import org.junit.Assert;
import org.junit.Test;

public class IsPalindromeTest {

    @Test
    public void smoke() {
        Assert.assertTrue(NumericTools.isPalindrome(4));
        Assert.assertTrue(NumericTools.isPalindrome(12421));
        Assert.assertTrue(NumericTools.isPalindrome(1221));
        Assert.assertFalse(NumericTools.isPalindrome(122));
    }

}
