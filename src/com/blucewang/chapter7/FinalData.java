package com.blucewang.chapter7;

import java.util.Random;

/**
 * final关键字的作用:
 * 1.一个编译时永不希望改变的常量
 * 2.运行时被初始化的值，而你希望它被改变
 * Created by bluceWang on 2017/2/21.
 */
public class FinalData {
    private static Random rand = new Random(50);

    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne=1;

    private static final int VALUE_TWO=2;

    public static final int VALUE_THREE=3;

    private final int i4 = rand.nextInt(20);

    private static final int INT_5=rand.nextInt(20);

    private Value v1=new Value(11);

    private final Value v2=new Value(22);

    private static final Value VAL_3=new Value(33);

    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return id+": "+"i4= "+i4+", INT_5 = "+ INT_5;
    }

    public static void main(String[] args) {
        FinalData idOne = new FinalData("idOne");
//        idOne.valueOne++;//常量值不能变更
//        idOne.v2 = new Value(44);//报错，final修饰对象，表示引用是固定的
        idOne.v2.i++;//引用不变，但是引用指向的对象可以做变更
        for(int i=0;i<idOne.a.length;i++){
            idOne.a[i]++;//数组 也是一个对象，final关键字修饰，表示引用不变，但是引用指向的数组是可以做变更的
        }
//        idOne.v2=new Value(22);//不能变更引用
//        idOne.VAL_3= new Value(1);//同上
//        idOne.a = new int[1];//同上
        /***
         *1.final 修饰的值是在运行时被初始化的
         * 2.static 的值是在第一次类加载时被初始化，而不是每次创建对象时进行
         */
        System.out.println(idOne);
        System.out.println("create new FinalData");
        FinalData idTwo = new FinalData("idTwo");
        System.out.println(idOne);
        System.out.println(idTwo);
        /**
         idOne: i4= 8, INT_5 = 17
         create new FinalData
         idOne: i4= 8, INT_5 = 17
         idTwo: i4= 13, INT_5 = 17
         */
    }
}
