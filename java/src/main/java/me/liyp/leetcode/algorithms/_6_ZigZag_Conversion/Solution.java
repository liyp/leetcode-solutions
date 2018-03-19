package me.liyp.leetcode.algorithms._6_ZigZag_Conversion;

public class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 0 || numRows == 1) {
            return s;
        }

        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int idx = 1;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = sbs[Math.abs(idx) - 1];
            sb.append(s.charAt(i));
            idx++;
            if (Math.abs(idx) == 0 || Math.abs(idx) > numRows) {
                idx = 2 - idx;
            }
        }
        StringBuilder finalSb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            finalSb.append(sbs[i]);
        }
        return finalSb.toString();
    }
}
