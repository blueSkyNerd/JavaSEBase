package com.blucewang.chapter18_io.extra;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 先写入student，在写入teacher1和teacher2，t1和t2都含有同一个student的引用，那么序列化，是否是序列化多个student呢？
 * 只会序列化一个student,后面只会序列化输出一个序列化编号
 *
 * Created by bluceWang on 2017/6/22.
 */
public class WriteTeacher {
    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("teacher.txt"))) {
            Person per = new Person("孙悟空",400);
            Teacher t1=new Teacher("菩提",per);
            Teacher t2 =new Teacher("唐僧",per);
            outputStream.writeObject(t1);
            outputStream.writeObject(t2);
            outputStream.writeObject(per);
            outputStream.writeObject(t2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
