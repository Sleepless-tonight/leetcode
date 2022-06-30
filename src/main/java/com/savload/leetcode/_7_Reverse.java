package com.savload.leetcode;

/**
 * @author shili
 * @Classname _7_Reverse
 * @Date 2021/8/3 16:42
 * @Description  整数反转:给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 */
public class _7_Reverse {
    public static void main(String[] args) {
        int a = 21;
        int b = 4321;
        int c = 654321;
        int d = -654321;
        int e = 1534236469;
        int f = -2147483412;
        int reverse = reverse(f);
        System.out.println(reverse);

    }

    public static int reverse(int x) {
        int i = 0;
        boolean a = false;
        if (x < 0) {
            a = true;
            if (x == Integer.MIN_VALUE) {
                return 0;
            }
            x = x * -1;
        }
        while (x > 0) {
            int i1 = x % 10;
            x = x / 10;
            if (i > Integer.MAX_VALUE / 10) {
                return 0;
            }
            i = i * 10 + i1;
        }
        if (a) {
            i = i * -1;
        }

        return i;
    }
}
