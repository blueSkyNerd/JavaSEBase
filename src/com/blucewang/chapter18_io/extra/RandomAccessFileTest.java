package com.blucewang.chapter18_io.extra;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by bluceWang on 2017/6/22.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("src\\com\\blucewang\\chapter18_io\\extra\\RandomAccessFileTest.java", "r")) {
            file.seek(300);
            byte[] buf = new byte[1024];
            int hasRead=0;
            while ((hasRead=file.read(buf))!=-1){
                System.out.print(new String(buf,0,hasRead));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
