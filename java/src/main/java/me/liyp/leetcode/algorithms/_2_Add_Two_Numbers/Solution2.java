package me.liyp.leetcode.algorithms._2_Add_Two_Numbers;

public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l1_idx = l1;
        ListNode l2_idx = l2;
        ListNode ls_idx = result;
        ListNode ls_idx_pre = null;
        for (;;) {
            if (l1_idx == null && l2_idx == null) {
                if (ls_idx.val == 0 && ls_idx_pre != null) {
                    ls_idx_pre.next = null;
                }
                return result;
            }
            if (l1_idx == null) {
                l1_idx = new ListNode(0);
            }
            if (l2_idx == null) {
                l2_idx = new ListNode(0);
            }

            ls_idx.val = ls_idx.val + l1_idx.val + l2_idx.val;
            if (ls_idx.val >= 10) {
                ls_idx.val %= 10;
                ls_idx.next = new ListNode(1);
            } else {
                ls_idx.next = new ListNode(0);
            }
            l1_idx = l1_idx.next;
            l2_idx = l2_idx.next;
            ls_idx_pre = ls_idx;
            ls_idx = ls_idx.next;
        }
    }

}
