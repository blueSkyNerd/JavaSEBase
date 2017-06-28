package com.blucewang.chapter18_io.extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by bluceWang on 2017/6/22.
 */
public class ReadTeacher {
    public static void main(String[] args) {
        try (ObjectInputStream teacher = new ObjectInputStream(new FileInputStream("teacher.txt"))) {
            //需要顺序取出
            Teacher t1 = (Teacher)teacher.readObject();
            Teacher t2 = (Teacher)teacher.readObject();
            Person s = (Person)teacher.readObject();
            Teacher t3 = (Teacher)teacher.readObject();
            //判断t1中student引用是否和t2相同
            System.out.println("t1中的student是否与t2中的student引用相等"+(t1.getPerson()==t2.getPerson()));
            //判断t1中的student引用是否和p1引用相同
            System.out.println("t1中的student是否与s中的student引用相等"+(t1.getPerson()==s));
            //判断t2和t3是否相同
            System.out.println("t2是否与t3中的teacher引用相等"+(t3==t3));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
