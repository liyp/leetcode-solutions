package me.liyp.leetcode.algorithms._6_ZigZag_Conversion;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void convert() {
        String s = solution.convert("", 1);
        Assert.assertEquals("", s);
    }

    @Test
    public void convert_2() {
        String s = solution.convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", s);
    }
}