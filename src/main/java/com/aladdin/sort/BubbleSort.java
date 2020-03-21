package com.aladdin.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author lgc
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {3, 2, 1, 4, 5};
        bubbleSort(ints);
    }

    static void bubbleSort(int[] arr) {
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
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 优化 正反
     */
    static void BubbleSort(int[] arr, int len) {
        int i = 0;
        int j = 0;
        //同时找最大值的最小需要两个下标遍历
        int n = 0;
        int flag = 0;
        //用来记录最后一次交换的位置
        int pos = 0;
        int k = len - 1;
        //确定排序趟数
        for (i = 0; i < len - 1; i++) {
            pos = 0;
            flag = 0;
            //正向寻找最大值
            //确定比较次数
            for (j = n; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    //加入标记
                    flag = 1;
                    //交换元素，记录最后一次交换的位置
                    pos = j;
                }
            }
            //如果没有交换过元素，则已经有序,直接结束
            if (flag == 0) {
                return;
            }
            //下一次比较到记录位置即可
            k = pos;
            //反向寻找最小值
            for (j = k; j > n; j--) {
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
                flag = 1;
            }
            n++;
            //如果没有交换过元素，则已经有序,直接结束
            if (flag == 0) {
                return;
            }
        }
    }
}
