package me.liyp.leetcode.algorithms._1_Two_Sum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    private int[] nums;
    private int target;

    @Before
    public void before() {
        nums = new int[] {2, 7, 11, 15};
        target = 9;
    }

    @Test
    public void test() {
        int[] result = solution.twoSum(nums, target);
        Assert.assertArrayEquals(new int[] {0, 1}, result);
    }

    @Test
    public void test_1() {
        int[] result = solution.twoSum_1(nums, target);
        Assert.assertArrayEquals(new int[] {0, 1}, result);
    }


}
