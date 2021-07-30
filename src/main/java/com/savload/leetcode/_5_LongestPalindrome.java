package com.savload.leetcode;

import java.util.HashMap;

/**
 * @author shili
 * @Classname _5_LongestPalindrome
 * @Date 2021/7/30 10:06
 * @Description 给你一个字符串 s，找到 s 中最长的回文子串。回文：就是正读，反读一样的字符串，如ABA
 */
public class _5_LongestPalindrome {
    public static void main(String[] args) {
        String bb = "bb";
        String ba = "ba";
        String bab = "bab";
        String babad = "babad";

        System.out.println(longestPalindrome(bb));
    }

    public static String longestPalindrome(String s) {
        String rs = null;
        if (null == s) {
            return null;
        }
        if (s.length() == 1) {
            return s;
        }

        // 中心字符串
        int coreIndex = 0;
        // 回文右进
        int r = 0;
        // 回文左进
        int l = 0;
        // 回文最大
        int max = 0;

        HashMap<Character, Integer> stringStringHashMap = new HashMap<>();
        while (coreIndex < s.length() && coreIndex + r < s.length()) {
            Character rChar = null;
            Character lChar = null;
            Character coreIndexChar = s.charAt(coreIndex);

            // true 是偶数
            boolean a = coreIndex % 2 == 0 ? true : false;


            int i = coreIndex + r;
            if (i < s.length()) {
                rChar = s.charAt(i);
            }
            int i1 = coreIndex - l;
            if (i1 >= 0) {
                lChar = s.charAt(i1);
            }
            if (null != rChar && null != lChar && rChar.equals(lChar)) {
                r++;
                l++;
            } else if (null != rChar && null != lChar && rChar.equals(lChar)) {

            } else if (null != rChar && null != lChar && rChar.equals(lChar)) {
            }


        }

        return rs;
    }
}
