package com.geek.algorithm.leetcode;

import java.util.Arrays;

/**
 * [66]加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一
 *
 * @author maoenqi
 * @date 2020/2/19
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i]%10;
            if (digits[i] > 0) {
                return digits;
            }
        }
        // 若出现99，999情况，新增一位
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}