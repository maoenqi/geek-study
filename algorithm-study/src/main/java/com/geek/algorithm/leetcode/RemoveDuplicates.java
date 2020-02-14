package com.geek.algorithm.leetcode;

import java.util.Arrays;

/**
 * [26]删除排序数组中的重复项
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * @author maoenqi
 * @date 2020/2/14
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int currentNum = 0;
        int preNum = 0;
        int newLength = 0;
        for (int i = 0; i < nums.length; i++) {
            currentNum = nums[i];
            if (i > 0) {
                preNum = nums[i-1];
                if (currentNum > preNum) {
                    newLength++;
                    nums[newLength - 1] = currentNum;
                }
            } else {
                newLength++;
            }
        }
        return newLength;
    }
}