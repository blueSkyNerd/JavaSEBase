package com.blucewang.chapter5.five;

/**
 * Created by bluceWang on 2017/2/18.
 */
public class StaticSerizationMain {

    public static void main(String[] args) {
        //这种调用会初始化该类对应的静态数据
//        Dog.resetDogName("guizi");
        System.out.println("init dog by new ");
        new Dog();
    }
}
