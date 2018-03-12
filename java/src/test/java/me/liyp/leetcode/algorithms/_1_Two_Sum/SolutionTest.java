package me.liyp.leetcode.algorithms._1_Two_Sum;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        Assert.assertArrayEquals(new int[] {0, 1}, result);
    }

}
