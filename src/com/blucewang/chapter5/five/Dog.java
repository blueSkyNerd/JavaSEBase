package com.blucewang.chapter5.five;

/**
 * Created by bluceWang on 2017/2/18.
 */
public class Dog {
    public static DogNameGenerater dogDefaultName=new DogNameGenerater(1);

    private DogNameGenerater dogGeneraterField = new DogNameGenerater(2);

    public Dog() {
        System.out.println("dog is init");
    }

    public static boolean resetDogName(String name){
        System.out.println("reset dog name ,new name is "+ name);
        return true;
    }
}
