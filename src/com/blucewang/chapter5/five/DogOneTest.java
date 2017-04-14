package com.blucewang.chapter5.five;

import java.util.Arrays;

/**
 * Created by bluceWang on 2017/2/18.
 */
public class DogOneTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Dog.resetDogName("aa");
        DogOne dogOne = new DogOne();
        System.out.println("==use dog static method in main==");
        DogOne.printDogOneName();
    }
}
