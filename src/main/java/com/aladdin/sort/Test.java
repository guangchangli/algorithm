package com.aladdin.sort;

/**
 * 查询数组中第k小的奇数 不存在返回 0 arr[i]>0 i>=0
 *
 * @author lgc
 **/
public class Test {
    public static void main(String[] args) {
        int[] ints = {3, 1, 5, 2, 4};
        System.out.println(findKth(ints, 2));
    }

    static int findKth(int[] arr, int k) {
        //排序
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                if (count == k) {
                    return arr[i];
                }
                count++;
            }
        }
        return 0;
    }
}
