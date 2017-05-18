package com.blucewang.chapter18_io.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bluceWang on 2017/5/17.
 */
public class P7BackOutFile {
    public static List<String> getLineListByFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s ;
        List<String> list = new LinkedList<>();
        while ((s=reader.readLine())!=null){
            list.add(s+"\n");
        }
        reader.close();
        return list;
    }

    public static void main(String[] args) throws IOException {
        List<String> list = getLineListByFile("D:\\soft\\code\\JavaSEBase\\src\\com\\blucewang\\chapter18_io\\practice\\P7BackOutFile.java");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            stringBuilder.append(list.get(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
