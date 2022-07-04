package com.savload.leetcode;

/**
 * @author shiliang
 * @Classname com.savload.leetcode IntToRoman
 * @Date 2022/06/30 18:01
 * @Description 整数转罗马数字
 */
public class IntToRoman {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(new IntToRoman().intToRoman(num));
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
     *
     * 输入: num = 1994
     * 输出: "MCMXCIV"
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     *
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        String s = null;
        StringBuilder stringBuilder = new StringBuilder();

        String[] strings = {"I","V","X","L","C","D","M"};
        int a = 0;
        while (true) {
            int i = num / 10;
            int i1 = num % 10;
            if (i > 0) {
                num = i;
                if (i1 != 0) {
                    if (a == 0) {

                        if (i1 < 4) {
                            for (int j = 0; j < i1; j++) {
                                stringBuilder.append("I");
                            }
                        } else if (i1 == 4) {
                            stringBuilder.append("IV");

                        } else if (i1 == 5) {
                            stringBuilder.append("V");

                        } else if (i1 == 9) {
                            stringBuilder.append("IX");
                        } else {
                            stringBuilder.append("V");
                            for (int j = 0; j < i1 - 5; j++) {
                                stringBuilder.append("I");
                            }
                        }


                    } else if (a == 1) {

                    } else if (a == 2) {

                    } else if (a == 3) {

                    } else if (a == 4) {

                    }
                }
                a++;
            } else {
                break;
            }
        }


        return s;
    }
}
