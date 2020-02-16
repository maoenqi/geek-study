package com.geek.algorithm.leetcode;

import java.util.Arrays;

/**
 * [283]移动零
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author maoenqi
 * @date 2020/2/16
 */
public class MoveZeroes {

    public static void main(String[] args) {
         int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0, 0, 1};
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        int notZeroCount = 0;
        // 非0数字往前移，并记录非0总数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[notZeroCount] = nums[i];
                notZeroCount++;
            }
        }
        // 剩余归零
        for (int i = notZeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}