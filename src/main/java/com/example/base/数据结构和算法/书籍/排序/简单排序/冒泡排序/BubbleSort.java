package com.example.base.数据结构和算法.书籍.排序.简单排序.冒泡排序;

import java.util.ArrayList;
import java.util.List;

/**
 * 冒泡排序: 从队列的最左边开始，比较0号位置和1号位置的队员。如果左边的队员高，就让两个队员交换。如果右边的队员高，就什么也不做。
 * 然后右移一个位置，比较1号位置和2号位置的队员，和刚才一样，如果左边的队员高，则两个队员交换位置。
 */

public class BubbleSort {

    public static void main(String[] args) {

        long[] arr = new long[]{23, 4, 67, 100, 300, 97, 81};
        bubbleSort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
        }
        System.out.println("");
    }

    private static void bubbleSort(long[] arr) {
        int out, in;
        for (out = arr.length - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(arr, in, in + 1);
                }
            }
        }
    }

    private static void swap(long[] arr, int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
