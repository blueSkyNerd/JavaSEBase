package com.blucewang.chapter18_io.practice;

import java.io.*;
import java.util.stream.Stream;

/**
 * Created by bluceWang on 2017/5/19.
 */
public class P14WriteCompare {
    private final static String outPutFileName="src\\com\\blucewang\\chapter18_io\\practice\\P14WriteCompare.txt";
    public static void writeUnBuffer(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        FileOutputStream out = new FileOutputStream(new File(outPutFileName));
        String s;
        long startTime = System.currentTimeMillis();
        while ((s=reader.readLine())!=null){
            out.write((s+"\n").getBytes());
        }
        out.close();
        System.out.println("unBuffer write time:"+(System.currentTimeMillis()-startTime)+"����");
    }

    public static void writeBuffer(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        PrintWriter out = new PrintWriter(outPutFileName);
        String s;
        long startTime = System.currentTimeMillis();
        while ((s=reader.readLine())!=null){
            out.print(s+"\n");
        }
        out.close();
        System.out.println("buffer write time:"+(System.currentTimeMillis()-startTime)+"����");
    }

    public static void main(String[] args) throws IOException {
        String fileName = "src\\com\\blucewang\\chapter18_io\\practice\\P14WriteCompare.java";
        writeUnBuffer(fileName);
        writeBuffer(fileName);
    }

}
