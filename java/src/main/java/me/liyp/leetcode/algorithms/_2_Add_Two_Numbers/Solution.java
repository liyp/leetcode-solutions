package me.liyp.leetcode.algorithms._2_Add_Two_Numbers;

import java.math.BigDecimal;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return reconvert(convert(l1).add(convert(l2)));
    }

    BigDecimal convert(ListNode ln) {
        BigDecimal result = BigDecimal.ZERO;
        ListNode lidx = ln;
        for (int i = 0; lidx != null; lidx = lidx.next, i++) {
            result = result.add(BigDecimal.valueOf(lidx.val * Math.pow(10, i)));
        }
        return result;
    }

    ListNode reconvert(BigDecimal number) {
        ListNode result = new ListNode(0);
        if (number.compareTo(BigDecimal.ZERO) == 0) {
            return result;
        }
        for (ListNode lidx = result; number.compareTo(BigDecimal.ZERO) != 0; lidx = lidx.next, number = number
                .divideToIntegralValue(BigDecimal.TEN)) {
            lidx.next = new ListNode(number.remainder(BigDecimal.TEN).intValue());
        }
        return result.next;
    }

}