package com.savload.leetcode;

import java.util.HashMap;

/**
 * @author shiliang
 * @Classname com.savload.leetcode _13_RomanToInt
 * @Date 2022/07/04 15:13
 * @Description 罗马数字转整数
 */
public class _13_RomanToInt {
    public static void main(String[] args) {
        String num = "MCM";
        System.out.println(new _13_RomanToInt().romanToInt(num));
    }

    /**
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     * <p>
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     * <p>
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 给你一个整数，将其转为罗马数字。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/integer-to-roman
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * <p>
     * 输入: num = 1994
     * 输出: "MCMXCIV"
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int a = 0;

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>() {
            {
                put("I", 1);
                put("IV", 4);
                put("V", 5);
                put("IX", 9);
                put("X", 10);
                put("XL", 40);
                put("L", 50);
                put("XC", 90);
                put("C", 100);
                put("CD", 400);
                put("D", 500);
                put("CM", 900);
                put("M", 1000);
            }

        };

        char[] chars = s.toCharArray();
        int b = 0;
        while (b < chars.length) {
            Integer s1 = hashMap.get(chars[b] + "");
            Integer s2 = null;
            if (b + 1 < chars.length) {
                s2 = hashMap.get(chars[b] + "" + chars[b + 1]);
            }

            if (null != s2) {
                a = a + s2;
                b++;
            } else {
                a = a + s1;
            }
            b++;
        }

        return a;
    }
}
