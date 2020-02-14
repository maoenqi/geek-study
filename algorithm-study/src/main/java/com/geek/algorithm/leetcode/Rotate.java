package com.geek.algorithm.leetcode;

import java.util.Arrays;

/**
 * [189]旋转数组
 * <p>
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * @author maoenqi
 * @date 2020/2/14
 */
public class Rotate {

    public static void main(String[] args) {
        // [7,8,9, 1,2,3,4,5,6]
        // [9,8,7,6,5,4,3,2,1]
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nums));
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            exchange(nums, start, end);
            start++;
            end--;
        }
    }

    private static void exchange(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}