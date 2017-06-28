package com.blucewang.chapter18_io.practice;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.BitSet;

/**
 * Created by bluceWang on 2017/6/20.
 */
public class P23PrintCharBuffer {
    static BitSet isPrintable=new BitSet(127);
    static String encode = System.getProperty("file.encoding");

    static {
        for (int i=32;i<127;i++){
            isPrintable.set(i);
        }
    }

    //遇到不能打印的字节，把最后位置置为上一个可读位置
    public static void setIsPrintableLimit(CharBuffer cb){
        cb.rewind();
        while (isPrintable.get(cb.get()));
        cb.limit(cb.position()-1);
        cb.rewind();
    }

    public static void main(String[] args) {
        System.out.println("Default encode is "+ encode);
        CharBuffer buffer = ByteBuffer.allocate(16).asCharBuffer();
        buffer.put("ABCDE"+(char)0x01+"FG");
        buffer.rewind();
        System.out.println(buffer);
        setIsPrintableLimit(buffer);
        System.out.println(buffer);

    }
}
