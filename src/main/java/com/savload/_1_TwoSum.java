package com.savload;

import java.util.HashMap;

/**
 * @author shili
 * @Classname TwoSum
 * @Date 2021/7/28 17:39
 * @Description 两数之和
 */
public class _1_TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[]{0, 1};
        if (nums.length < 1) {
            return r;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length - 1);
        for (int i = 0; i < nums.length ; i++) {
            int a = nums[i];
            int i1 = target - a;
            Integer integer = hashMap.get(a);
            if (null != integer) {
                r[0] = integer;
                r[1] = i;
                return r;
            } else {
                hashMap.put(i1, i);
            }

        }
        return r;
    }
}
