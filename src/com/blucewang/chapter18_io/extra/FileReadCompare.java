package com.blucewang.chapter18_io.extra;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * IO 和 NIO 大文件读写比较
 * Created by bluceWang on 2017/6/21.
 */
public class FileReadCompare {
    public static void main(String[] args) throws Exception {
        //分隔1.11G的文件，nio用时9秒多，io读取用时41秒多
//        nioSplitFile();
        ioSplitFile();
    }

    private static void nioSplitFile() throws IOException {
        FileChannel fileChannel = new FileInputStream("C:\\Users\\w6\\Desktop\\info.log.2017-06-05").getChannel();
        //设定一个固定长度的byteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024 * 20);
        int logNum = 1;
        long start = System.currentTimeMillis();
        //向byteBuffer读入通道中的数据
        while ((fileChannel.read(buffer)) != -1) {
            //锁定空白区
            buffer.flip();
            File path = new File("D:\\temp\\nio");
            if (!path.exists()) {
                path.mkdirs();
            }
            FileChannel outChannel = new FileOutputStream("D:\\temp\\nio\\test" + (logNum++) + ".log").getChannel();
            outChannel.write(buffer);
            //将Buffer初始化，为下一次读取做准备
            buffer.clear();
        }
        System.out.println("NIO用时：" + (System.currentTimeMillis() - start) + "毫秒");
    }

    private static void ioSplitFile() throws IOException {
        BufferedReader in = new BufferedReader(
                new FileReader("C:\\Users\\w6\\Desktop\\info.log.2017-06-05"));
        //设定一个固定长度的byteBuffer
        char[] buffer = new char[1024 * 1024 * 20];
        int logNum = 1;
        long start = System.currentTimeMillis();
        //向byteBuffer读入通道中的数据
        while ((in.read(buffer)) != -1) {
            File path = new File("D:\\temp\\io");
            if (!path.exists()) {
                path.mkdirs();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\temp\\io\\test" + (logNum++) + ".log"));
            bufferedWriter.write(buffer);
            bufferedWriter.close();
        }
        System.out.println("IO用时：" + (System.currentTimeMillis() - start) + "毫秒");
    }

    private static void ioNotBufferSplitFile() {
        long start = System.currentTimeMillis();
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\w6\\Desktop\\info.log.2017-06-05"))) {
            //设定一个固定长度的byteBuffer
            char[] buffer = new char[1024 * 1024 * 20];
            int logNum = 1;
            //向byteBuffer读入通道中的数据
            while ((in.read(buffer)) != -1) {
                File path = new File("D:\\temp\\io");
                if (!path.exists()) {
                    path.mkdirs();
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\temp\\io\\test" + (logNum++) + ".log"));
                bufferedWriter.write(buffer);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("IO用时：" + (System.currentTimeMillis() - start) + "毫秒");
    }


}
