package com.savload.leetcode;

import java.math.BigDecimal;

public class _8_Solution {
    public static void main(String[] args) {


        String s = "-000000000000001";
        System.out.println(myAtoi(s));
    }



    public static int myAtoi(String s) {
        int a = 0;
        if (null == s) {
            return a;
        }
        String trim = s.trim();
        if (trim.length() == 0) {
            return a;
        }
        boolean aaaa = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < trim.length(); i++) {
            char c = trim.charAt(i);


            if (stringBuilder.length() == 0) {
                if (Character.isDigit(c) || c == '+' || c == '-') {
                    if (c == '0') {
                        continue;
                    } else if (c == '+' || c == '-') {
                        if (i != 0) {
                            return 0;
                        }
                        stringBuilder.append(c);
                        aaaa = true;
                    } else {
                        stringBuilder.append(c);
                    }
                } else {
                    return 0;
                }
            }else {
                if (Character.isDigit(c)) {
                    if (aaaa && stringBuilder.length() == 1 && c == '0') {
                        continue;
                    }else {
                        stringBuilder.append(c);
                    }
                }else {
                    break;
                }
            }

        }
        Integer integer = null;
        if (stringBuilder.length() > 0) {
            String s1 = stringBuilder.toString();
            if (s1.equals("+") || s1.equals("-")) {
                return 0;
            }
            BigDecimal bigDecimal = new BigDecimal(s1);
            // -1表示小于,0是等于,1是大于。
            if (bigDecimal.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) {
                integer = Integer.MAX_VALUE;
                return integer;
            }
            // -1表示小于,0是等于,1是大于。
            if (bigDecimal.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0) {
                integer = Integer.MIN_VALUE;
                return integer;
            }
            integer = bigDecimal.intValue();
        } else {
            return 0;
        }

        return integer;
    }
}
