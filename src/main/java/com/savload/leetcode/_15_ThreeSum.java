package com.savalueLLLoad.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author shiliang
 * @Classname com.savalueLLLoad.leetcode _15_ThreeSum
 * @Date 2022/07/04 16:14
 * @Description 三数之和
 */
public class _15_ThreeSum {

    public static void main(String[] args) {
        // int[] num = {-1, 0, 1, 2, -1, -4};
        // int[] num = {0, 0, 0};
        // int[] num = {0, 0, 0, 0};
        // int[] num = {-1, 0, 1, 0};
        // int[] num = {-1, 0, 1, 0, 3};
        // int[] num = {3,0,-2,-1,1,2};
        // int[] num = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        // int[] num = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        int[] num = {-4,-1,2,-1,-5,2,-4,-1,2,0,8};
        System.out.println(new _15_ThreeSum().threeSum(num));

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        if (null == nums || nums.length < 3) {
            return lists;
        }

        Arrays.sort(nums);
        ArrayList<Integer> arrayList = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            arrayList.add(num);
        }


        Integer i, l, r, valueLLL, valueRRR, valueiii, valueTTT;
        l = 0;
        r = arrayList.size() - 1;
        while (l < r - 1) {
            valueLLL = arrayList.get(l);
            valueRRR = arrayList.get(r);

            valueTTT = 0 - valueLLL - valueRRR;

            // 从左开始搜索
            if (valueTTT < 0) {
                i = l + 1;
            } else {
                // 从右开始搜索
                i = r - 1;
            }

            while (i > l && i < r) {

                valueiii = arrayList.get(i);

                if (valueTTT < 0) {
                    // 从左开始搜索(最左的也就是最小的大于目标值，直接跳出)
                    if (valueiii > valueTTT) {
                        break;
                    }
                } else {
                    // 从右开始搜索(最右的也就是最大的小于目标值，直接跳出)
                    if (valueiii < valueTTT) {
                        break;
                    }
                }

                if (valueiii.equals(valueTTT)) {
                    // 移动左重复坐标
                    while (l + 1 < i && valueLLL == arrayList.get(l + 1)) {
                        l++;
                    }

                    if (valueTTT < 0) {
                        // 从左开始搜索
                        while (i < r && valueiii == arrayList.get(i + 1)) {
                            i++;
                        }
                    } else {
                        // 从右开始搜索
                        while (i - 1 > l && valueiii == arrayList.get(i - 1)) {
                            i--;
                        }
                    }
                    // 移动右重复坐标
                    while (r - 1 > i && valueRRR == arrayList.get(r - 1)) {
                        r--;
                    }

                    List<Integer> integers = Arrays.asList(valueLLL, valueRRR, valueiii);

                    lists.add(integers);

                    if (valueTTT < 0) {
                        i++;
                    } else {
                        i--;
                    }
                } else {
                    if (valueTTT < 0) {
                        i++;
                    } else {
                        i--;
                    }
                }
            }

            // 从左开始搜索
            if (valueTTT < valueRRR) {
                r--;
            } else {
                // 从右开始搜索
                l++;
                r = arrayList.size() - 1;
            }

        }

        return lists;
    }
}
