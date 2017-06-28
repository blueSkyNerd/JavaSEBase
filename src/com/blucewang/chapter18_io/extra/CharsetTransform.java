package com.blucewang.chapter18_io.extra;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * 字符序列转成字节序列，字节序列转为字符序列
 * Created by bluceWang on 2017/6/27.
 */
public class CharsetTransform {
    public static void main(String[] args) {
        Charset charset = Charset.forName("GBK");
        CharsetDecoder decoder = charset.newDecoder();
        CharsetEncoder encoder = charset.newEncoder();

        CharBuffer cBuff = CharBuffer.allocate(8);
        cBuff.put("刘");
        cBuff.put("红");
        cBuff.put("红");
        cBuff.flip();

        try {
            ByteBuffer byteBuffer = encoder.encode(cBuff);
            for (int i=0;i<byteBuffer.capacity();i++){
                System.out.print(byteBuffer.get(i)+" ");
            }
            //转成字符序列
            System.out.println(decoder.decode(byteBuffer));
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        }


    }
}
