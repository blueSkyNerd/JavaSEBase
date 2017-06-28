package com.blucewang.chapter18_io.extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Created by bluceWang on 2017/6/20.
 */
public class FileRead {
    public static void main(String[] args) throws Exception {
        //获取文件输入流channel
        FileChannel fileChannel = new FileInputStream("src\\com\\blucewang\\chapter18_io\\BufferedInputFile.java").getChannel();

        //设定一个固定长度的byteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(256);
        //向byteBuffer读入通道中的数据
        while ((fileChannel.read(buffer)) != -1) {
            //锁定空白区
            buffer.flip();
            //创建解码器
            CharsetDecoder decoder = Charset.forName("GBK").newDecoder();
            //将byteBuffer数据转码
            CharBuffer charBuffer = decoder.decode(buffer);
            System.out.println(charBuffer);
            //将Buffer初始化，为下一次读取做准备
            buffer.clear();
        }
    }
}
