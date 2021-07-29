package com.savload;

import java.util.HashMap;

/**
 * @author shili
 * @Classname _3_LengthOfLongestSubstring
 * @Date 2021/7/28 17:43
 * @Description 无重复字符的最长子串
 */
public class _3_LengthOfLongestSubstring {
    public static void main(String[] args) {
        String aa = "aa";
        String ab = "ab";
        String aab = "aab";
        String abb = "abb";
        String abba = "abba";
        String abca = "abca";
        String abcabcbb = "abcabcbb";
        String tmmzuxt = "tmmzuxt";
        int i = lengthOfLongestSubstring(tmmzuxt);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (null == s) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int left = 0, right = 0;
        int max = 0;
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>(s.length());
        while (left < s.length() && right < s.length()) {
            char c = s.charAt(right);
            Integer integer = characterIntegerHashMap.get(c);
            characterIntegerHashMap.put(c, right);
            if (null == integer) {
                max = Math.max(right - left + 1, max);
            } else {
                left = Math.max(left, integer + 1);
                max = Math.max(right - left + 1, max);
            }
            right++;


        }
        return max;
    }
}
