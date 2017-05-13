package com.blucewang.chapter18_io.extra;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/**
 * Created by bluceWang on 2017/5/13.
 */
public class FileTest {
    public static void main(String[] args) {
        //根据当前路径来创建一个File对象
//        System.out.println(FileTest.class.getResource(""));
        File file = new File("FileTest");

//        System.out.println(file.getName());
//
//        System.out.println(file.getParent());

        System.out.println(file.getAbsoluteFile());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before jdk 8,too much code for too little to do!");
            }
        }).start();

        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();


        // Java 8之后：
        List features = asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));

        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
        // 看起来像C++的作用域解析运算符
        features.forEach(System.out::println);
    }
}
