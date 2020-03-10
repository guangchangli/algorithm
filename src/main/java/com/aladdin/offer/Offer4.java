package com.aladdin.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 示例:
 * 现有矩阵 matrix 如下：
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 * 限制：
 * 0 <= n <= 1000
 * 0 <= m <= 1000
 *
 * @author lgc
 **/
public class Offer4 {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        Set<Integer> set = new HashSet<>();
        set.add(target);
        int count =0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                set.add(anInt);
                count++;
            }
        }
        return count == set.size() ? true : false;
    }

    /**
     * 执行用时 :
     * 1 ms, 在所有 Java 提交中击败了35.69%
     * 内存消耗 :
     * 48.4 MB, 在所有 Java 提交中击败了100.00%
     */
    public static boolean findNumberIn2DArray2(int[][] matrix, int target) {

        boolean flag = false;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == target) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * 执行用时 :
     * 0 ms
     * , 在所有 Java 提交中击败了100.00%
     * 内存消耗 :
     * 48 MB, 在所有 Java 提交中击败了
     * 100.00%
     */
    public static boolean findNumberIn2DArray3(int[][] matrix,int target){
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] ints = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(ints.length);
        System.out.println(findNumberIn2DArray(ints, 20));
        System.out.println(findNumberIn2DArray2(ints, 20));
        System.out.println(findNumberIn2DArray3(ints, 20));
    }

}


