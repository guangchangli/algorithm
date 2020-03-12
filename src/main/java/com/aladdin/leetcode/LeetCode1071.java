package com.aladdin.leetcode;

/**
 * @author lgc
 **/
public class LeetCode1071 {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABA", "AB"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // 辗转相除法求gcd。
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
