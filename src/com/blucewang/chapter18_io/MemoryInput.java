package com.blucewang.chapter18_io;//: io/MemoryInput.java

import java.io.*;

public class MemoryInput {
    public static void main(String[] args)
            throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src\\com\\blucewang\\chapter18_io\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
//            System.out.print(c);
    }
} /* (Execute to see output) *///:~
