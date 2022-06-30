package com.savload.leetcode;

/**
 * 盛最多水的容器
 */
public class _11_MaxArea {
    public static void main(String[] args) {
        int[] a = {10, 8};
        _11_MaxArea maxArea = new _11_MaxArea();
        System.out.println(maxArea.maxArea(a));
    }
    public int maxArea(int[] height) {

        int a = 0;
        int l = 0;
        int r = height.length - 1;


        while (true) {


            if (height[l] >= height[r]) {
                a = Math.max(height[r] * (r - l), a);
                r--;
            } else {
                a = Math.max(height[l] * (r - l), a);
                l++;
            }
            if (l >= r) {
                break;
            }

        }

        return a;
    }
}
