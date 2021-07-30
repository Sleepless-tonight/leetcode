package com.savload.leetcode;

import java.util.HashMap;

/**
 * @author shili
 * @Classname _5_LongestPalindrome
 * @Date 2021/7/30 10:06
 * @Description 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class _5_LongestPalindrome {
    public static void main(String[] args) {
        String s = "a";

        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String rs = null;
        if (null == s) {
            return null;
        }
        if (s.length() == 1) {
            return s;
        }

        int l = 0, r = 0;
        new HashMap<>();
        while (l < s.length() && r < s.length()) {

        }

        return rs;
    }
}
