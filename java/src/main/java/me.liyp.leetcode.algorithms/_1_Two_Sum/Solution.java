package me.liyp.leetcode.algorithms._1_Two_Sum;

/**
 * @author liyp
 * @since 2018-03-13 00:06:33
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}
