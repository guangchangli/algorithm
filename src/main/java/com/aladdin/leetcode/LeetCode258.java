package com.aladdin.leetcode;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * 示例:
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 *
 * @author lgc
 **/
public class LeetCode258 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits1(38));
        /**
         * xyz=100*x+10*y+z
         *    =99*x+9*y+x+y+z
         *    =99*x+9*y+ab
         *    =99*x+9*y+10*a+b
         *    =99*x+9*y+9*a+a+b=
         */
    }
    // 38 =32 +6
    //  0010 0110
    //  0110

    /**
     * 10   1010         0110 1000
     * 100  0110 1000 38 0010 0110
     * 1000              0100 1110
     */
    public static int addDigits(int num) {
        int count = 0;
        for (; num != 0; num /= 10) {
            count += num % 10;
        }
        if (count >= 10) {
            count = addDigits(count);
        }
        return count;
    }

    public static int addDigits1(int num) {
        if (num % 9 == 0 && num != 0) {
            num = 9;
        } else {
            num %= 9;
        }
        return num;
    }

    public static int addDigits2(int num) {
        return (num - 1) % 9 + 1;
    }
}
