package com.blucewang.chapter18_io.extra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * 查找到new PushBackReader停止，程序打印出之前的字符串
 * Created by bluceWang on 2017/6/22.
 */
public class PushPackTest {


    public static void main(String[] args) {
        try (PushbackReader reader = new PushbackReader(new FileReader("src\\com\\blucewang\\chapter18_io\\extra\\PushPackTest.java"), 64)) {
            char[] buf = new char[32];
            int bufferLength = 0;
            int lastTatolLength = 0;
            String lastContent = null;
            //循环读取内容
            while ((bufferLength = reader.read(buf)) != -1) {
                String content = new String(buf, 0, bufferLength);
                //如果包含目标字符串，则打印目标字符串之前的字符串，并结束程序
                int targetLength = 0;
                if ((targetLength = (lastContent + content).indexOf("new PushbackReader")) > 0) {
                    //先把字符串pushBack回去，然后在进行读取
                    //读取字符串
                    reader.unread((lastContent + content).toCharArray());
                    if (targetLength > 32) {
                        buf = new char[targetLength];
                    }
                    reader.read(buf, 0, targetLength);
                    System.out.print(new String(buf, 0, targetLength));
                    System.exit(1);
                } else {
                    //如果不包含目标字符串，保存
                    System.out.print(lastContent);
                    lastContent = content;
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
