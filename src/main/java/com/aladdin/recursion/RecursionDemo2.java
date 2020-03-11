package com.aladdin.recursion;

/**
 * 递归乘法。 写一个递归函数，不使用 * 运算符， 实现两个正整数的相乘。可以使用加号、减号、位移，但要吝啬一些。
 * 示例1:
 * 输入：A = 1, B = 10
 * 输出：10
 * 示例2:
 * 输入：A = 3, B = 4
 * 输出：12
 * 提示:
 * 保证乘法范围不会溢出
 *
 * @author lgc
 **/
public class RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println(multiply(5, 3));
        System.out.println(multiply(4, 3));
    }

    public static int multiply(int A, int B) {
        if (A == 1) {
            return B;
        }
        return B += multiply(B, A - 1);
    }

    public static int multiply1(int A, int B) {
        if (B == 1) {
            return A;
        }
        if (B == 0) {
            return 0;
        }
        if ((B & 1) == 1) {
            return multiply1(A << 1, B >> 1) + A;
        } else {
            return multiply1(A << 1, B >> 1);
        }
    }
}
