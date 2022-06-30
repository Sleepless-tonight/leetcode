package com.savload.leetcode;

import java.math.BigDecimal;

public class _9_Solution {
    public static void main(String[] args) {


        int a = 101011;
        System.out.println(isPalindrome(a));
    }


    public static boolean isPalindrome(int x) {
        boolean a = false;
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String s = x + "";
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        int i = chars.length % 2;
        while (true) {
            char aCharl = chars[l];
            char aCharr = chars[r];
            if (aCharl != aCharr) {
                return false;
            }else {
                a = true;
            }



            if (i == 0) {
                if (l == r - 1) {
                    break;
                }
            } else {
                if (l == r - 2) {
                    break;
                }
            }
            l++;
            r--;

        }
        return a;
    }
}
