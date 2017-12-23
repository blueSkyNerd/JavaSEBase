package com.blucewang.chapter18_io.practice;

import java.io.*;
import java.util.LinkedList;
import java.util.Properties;

/**
 * Created by bluceWang on 2017/5/18.
 */
public class P12LineNumber  {
    private final static String outputFileName="src\\com\\blucewang\\chapter18_io\\P12LineNumber.out";
    public static void main(String[] args) throws IOException {
        String dir = System.getProperties().getProperty("user.dir");
        System.out.println(dir);
        BufferedReader reader = new BufferedReader(new FileReader("src\\com\\blucewang\\chapter18_io\\practice\\P12LineNumber.java"));
        PrintWriter writer = new PrintWriter(new FileWriter(outputFileName));
        String s;
        LinkedList list = new LinkedList<>();
        Integer i=0;
        while ((s=reader.readLine())!=null){
            list.add("lineNumber"+ ++i +":"+s);
        }
        list.forEach((n)->{
            System.out.println(n);
        });
    }
}
