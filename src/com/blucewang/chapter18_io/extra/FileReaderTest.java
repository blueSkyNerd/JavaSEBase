package com.blucewang.chapter18_io.extra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bluceWang on 2017/12/11.
 */
public class FileReaderTest {

    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();
        try (FileReader fileRead = new FileReader("src/com/blucewang/chapter18_io/extra/FileReaderTest.java")) {
            char[] chars = new char[1024];
            while (fileRead.read(chars)>0){
                strBuff.append(chars);
            }
            System.out.println(strBuff.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
