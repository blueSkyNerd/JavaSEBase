package com.blucewang.chapter15_generic;

import java.util.Iterator;

/**
 * Created by bluceWang on 2017/3/29.
 */
public class IterableFibonacci2 implements Iterable<Integer>{
    private Fibonacci fibonacci=new Fibonacci();
    private int i=0;

    public IterableFibonacci2(int i) {
        this.i = i;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return i>0;
            }

            @Override
            public Integer next() {
                i--;
                return fibonacci.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

    }

    public static void main(String[] args) {
        IterableFibonacci2 iterableFibonacci2 = new IterableFibonacci2(10);
        for (int i:
             iterableFibonacci2) {
            System.out.print(i+" ");
        }

        System.out.println("------");
        IterableFibonacci iterableFibonacci = new IterableFibonacci(10);
        for (int i:
             iterableFibonacci) {
            System.out.print(i+" ");
        }
    }
}
