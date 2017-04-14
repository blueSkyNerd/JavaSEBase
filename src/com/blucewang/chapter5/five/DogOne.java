package com.blucewang.chapter5.five;

import java.lang.reflect.Method;

/**
 * Created by bluceWang on 2017/2/18.
 */
public class DogOne {
    private static String dogName = "guiyong";

    private static  String dogNickName ;

    static {
        dogNickName = "xiaoguizi";
        System.out.println(dogName);
        System.out.println(dogNickName);
    }

    public static void printDogOneName(){
        System.out.println("print dog name in static method");
        System.out.println(dogName);
        System.out.println(dogNickName);
    }

    public String  getDogNickName(String prefix,String suffix){
        return prefix+dogNickName+suffix;
    }

    public static void main(String[] args) throws NoSuchMethodException {
//        MethodInvoker methodInvoker = new MethodInvoker();
        DogOne one = new DogOne();
        Class[] objects = new Class[2];
        objects[0]="A".getClass();
        objects[1]="B".getClass();
        DogOne.class.getMethod(one.getDogNickName("A","B").toString(),objects);
    }

}
