package com.blucewang.chapter18_io.extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by bluceWang on 2017/6/22.
 */
public class ReadObject {
    public static void main(String[] args) {
        //反序列化，必须有对应的class文件
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Object.txt"))) {
            Person person = (Person) inputStream.readObject();
            System.out.println("人物名称为:"+person.getName()+",年龄为:"+person.getAge());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
