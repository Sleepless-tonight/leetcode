package com.savload.leetcode;

/**
 * @author shili
 * @Classname _7_Reverse
 * @Date 2021/8/3 16:42
 * @Description
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
