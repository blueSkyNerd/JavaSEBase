package com.blucewang.chapter10_innerClass;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import com.blucewang.chapter10_innerClass.practice.P2_classHoldString;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    /***
     * 使用到迭代器模式
     */
    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        /**
         * 返回外部类的引用
         * @return
         */
        public Sequence getOuterClass(){ return Sequence.this;}

        public void next() {
            if (i < items.length) i++;
        }
    }

    public boolean check(){
        return this==((SequenceSelector)selector()).getOuterClass();
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    private class ReverseSequenceSelector implements Selector{
        private int i=items.length;
        @Override
        public boolean end() {
            return i==0;
        }

        @Override
        public Object current() {
            return items[i-1];
        }

        @Override
        public void next() {
            if (i>0) i--;
        }
    }

    public Selector reverseSelector(){return  new ReverseSequenceSelector();}

    public static void main(String[] args) {
//        Sequence sequence = new Sequence(10);
//        for (int i = 0; i < 10; i++)
//            sequence.add(Integer.toString(i));
//        Selector selector = sequence.selector();
//        while (!selector.end()) {
//            System.out.print(selector.current() + " ");
//            selector.next();
//        }

        /**------------------------------------------*/

        Sequence sequence = new Sequence(10);
        System.out.println(sequence.check());
        for (int i = 0; i < 10; i++)
            sequence.add(new P2_classHoldString("str"+i));
        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println("---------------------------------------");
        //练习题22
        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }


    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
