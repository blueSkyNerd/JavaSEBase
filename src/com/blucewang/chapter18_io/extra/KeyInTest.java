package com.blucewang.chapter18_io.extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bluceWang on 2017/6/22.
 */
public class KeyInTest {
    public static void main(String[] args) {
        //字节输入流包装成字符流，字符在包装成字符缓冲流
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = null;
            //以换行符为标记，如果它没有读到换行符，则程序阻塞
            while ((line = reader.readLine()) != null) {
                if ("exsit".equals(line)){
                    System.exit(1);
                }
                System.out.println("输入内容为:"+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
