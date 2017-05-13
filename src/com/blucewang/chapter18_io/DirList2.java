package com.blucewang.chapter18_io;//: io/DirList2.java
// Uses anonymous inner classes.
// {Args: "D.*\.java"}

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList2 {
    /***
     * JDK1.8 进行了优化，如果匿名内部类使用传入的参数不是final，
     * 则在编译的时候自动优化
     * @param regex
     * @return
     */
    public static FilenameFilter filter(String regex) {
        // Creation of anonymous inner class:
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        }; // End of anonymous inner class
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(filter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
} /* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
