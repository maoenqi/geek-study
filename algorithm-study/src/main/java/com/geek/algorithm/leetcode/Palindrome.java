package com.geek.algorithm.leetcode;

/**
 * [125]验证回文串
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * @author maoenqi
 * @date 2020/2/14
 */
public class Palindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        new StringBuilder().reverse();
        StringBuilder newStrSB = toNumAndLetter(s);
        String newStr = newStrSB.toString();
        String newReverseStr = newStrSB.reverse().toString();
        return newStr.equalsIgnoreCase(newReverseStr);
    }

    private static StringBuilder toNumAndLetter(String str) {
        StringBuilder strSB = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            // 是否数字或字母
            boolean numOrLetter = (aChar>='0' && aChar<='9') || (aChar>='a' && aChar<='z') || (aChar>='A' && aChar<='Z');
            if (numOrLetter) {
                strSB.append(aChar);
            }
        }
        return strSB;
    }
}