package me.liyp.leetcode.algorithms._2_Add_Two_Numbers;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SolutionTest {

    private Solution solution = new Solution();
    private Solution2 solution2 = new Solution2();


    @Test
    public void addTwoNumbers() {
        ListNode l1 = solution.reconvert(BigDecimal.valueOf(342));
        ListNode l2 = solution.reconvert(BigDecimal.valueOf(465));

        ListNode ls = solution2.addTwoNumbers(l1, l2);
        Assert.assertEquals(7, ls.val);
        Assert.assertEquals(0, ls.next.val);
        Assert.assertEquals(8, ls.next.next.val);
    }

    @Test
    public void addTwoNumbers_0() {
        ListNode l1 = solution.reconvert(BigDecimal.ZERO);
        ListNode l2 = solution.reconvert(BigDecimal.ZERO);

        ListNode ls = solution2.addTwoNumbers(l1, l2);
        Assert.assertEquals(0, ls.val);
    }

    @Test
    public void addTwoNumbers_1() {
        ListNode l1 = solution.reconvert(BigDecimal.valueOf(9));
        ListNode l2 = solution.reconvert(BigDecimal.valueOf(9999999991L));

        ListNode ls = solution2.addTwoNumbers(l1, l2);
        Assert.assertEquals(0, ls.val);
    }
}