package com.blucewang.chapter18_io.extra;

import com.blucewang.net.mindview.util.TextFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/**
 * Created by bluceWang on 2017/5/13.
 */
public class FileTest {
    public static void main(String[] args) {
        //���ݵ�ǰ·��������һ��File����
//        System.out.println(FileTest.class.getResource(""));
        File file = new File("src/com/blucewang/chapter18_io/extra/FileTest.java");
        if(file.exists()){
            System.out.println("FileTest is exist");
        }
//        System.out.println(file.getName());
//
//        System.out.println(file.getParent());

        System.out.println(file.getAbsoluteFile());


        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

   /*     new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before jdk 8,too much code for too little to do!");
            }
        }).start();

        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();


        // Java 8֮��
        List features = asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));

        // ʹ��Java 8�ķ������ø����㣬����������::˫ð�Ų�������ʾ��
        // ��������C++����������������
        features.forEach(System.out::println);*/
    }
}
