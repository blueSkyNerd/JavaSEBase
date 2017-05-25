package com.blucewang.chapter18_io.practice;

import com.blucewang.chapter15_generic.practice.LiLiWang;
import com.blucewang.chapter18_io.BufferedInputFile;

import java.io.*;

/**
 * Created by bluceWang on 2017/5/18.
 */
public class P13LineNumberReader {
    static String file = "src\\com\\blucewang\\chapter18_io\\BasicFileOutput.out";

    public static void main(String[] args)
            throws IOException {
        LineNumberReader in = new LineNumberReader(
              new FileReader("src\\com\\blucewang\\chapter18_io\\BasicFileOutput.java"));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(in.getLineNumber() + ": " + s);
        out.close();
        out.close();
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
