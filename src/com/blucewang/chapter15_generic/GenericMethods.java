package com.blucewang.chapter15_generic;

/**
 * Created by bluceWang on 2017/3/29.
 */
public class GenericMethods {
    public <T> void f(T t){
        System.out.println(t.getClass().getSimpleName());
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("");
        genericMethods.f(new Fibonacci());
        genericMethods.f(New.list());
        genericMethods.f(New.map());
    }

}
