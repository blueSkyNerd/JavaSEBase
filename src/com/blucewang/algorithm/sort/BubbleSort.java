package com.blucewang.algorithm.sort;

/**
 * ����˼��:
 * ��Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ������
 * ���϶��¶����ڵ����������ν��бȽϺ͵������ýϴ�������³�����С������ð��
 * ����ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
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
