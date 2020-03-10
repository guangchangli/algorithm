package com.aladdin.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * @author lgc
 **/
public class Offer3 {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(new Solution().findRepeatNumber(ints));
        System.out.println(new Solution().findRepeatNumber2(ints));
        System.out.println(new Solution().findRepeatNumber3(ints));
    }
}

class Solution {
    /**
     * 2861 ms	49.9 MB
     */
    public int findRepeatNumber(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result = nums[i];
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 2 ms	49.9 MB
     */
    public int findRepeatNumber2(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * 7 ms	54 MB
     */
    public int findRepeatNumber3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size()!=i+1){
                return nums[i];
            }
        }
        return -1;
    }
}
