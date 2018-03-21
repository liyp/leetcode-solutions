package me.liyp.leetcode.algorithms._5_Longest_Palindromic_Substring;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }

        String res = s.substring(0, 1);

        int l_limit = 0;
        while (l_limit < s.length()) {
            int r_limit = s.length() - 1;
            while (r_limit >= l_limit) {
                if (res.length() >= r_limit - l_limit + 1) {
                    break;
                }
                r_limit = s.lastIndexOf(s.charAt(l_limit), r_limit);
                if (l_limit + 1 == r_limit) {
                    String ck = s.substring(l_limit, r_limit + 1);
                    if (ck.length() > res.length()) {
                        res = ck;
                    }
                    break;
                }
                if (r_limit > l_limit) {
                    int i = l_limit + 1;
                    int pre_r = r_limit;
                    for (;;) {
                        int j = s.lastIndexOf(s.charAt(i), pre_r - 1);
                        if (j < i || j != pre_r - 1) {
                            break;
                        }
                        if (i == j || i + 1 == j) {
                            String ck = s.substring(l_limit, r_limit + 1);
                            if (ck.length() > res.length()) {
                                res = ck;
                            }
                            break;
                        }
                        pre_r = j;
                        i++;
                    }
                }
                r_limit--;
            }
            l_limit++;
        }
        return res;
    }
}
