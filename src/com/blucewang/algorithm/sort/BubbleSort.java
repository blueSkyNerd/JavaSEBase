package com.blucewang.algorithm.sort;

/**
 * 基本思想:
 * 在要排序的一组数中，对当前还未排好序的范围内的全部数，
 * 自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * Created by bluceWang on 2017/3/15.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {6, 49, 38, 65, 97, 5, 4};
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
