package com.geek.algorithm.leetcode;

import java.util.Arrays;

/**
 * [88]合并两个有序数组
 * <p>
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * @author maoenqi
 * @date 2020/2/16
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        // {1,2,3,2,5,6}
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n;
        // 填充数据
        for (int i = m; i < total; i++) {
            nums1[i] = nums2[i - m];
        }
        // 排序
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}