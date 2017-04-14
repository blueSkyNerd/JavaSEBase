package com.blucewang.chapter15_generic;

import java.util.Iterator;

/**
 * ʹ�ü̳���ʵ��������
 * Created by bluceWang on 2017/3/29.
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;

    public IterableFibonacci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                //�ᱨ��
//                return this.next();
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibonacci iterableFibonacci = new IterableFibonacci(10);
        for (int i:
             iterableFibonacci) {
            System.out.println(i);
        }
    }
}
