package com.blucewang.chapter18_io.extra;

import java.io.File;

/**
 * Created by bluceWang on 2017/5/13.
 */
public class FileNameFilter {
    public static void main(String[] args) {
        File file = new File(FileNameFilter.class.getResource("").toString());
        System.out.println(file.getAbsoluteFile());
        String[] nameList = file.list(((dir, name) -> name.endsWith(".class") || new File(name).isDirectory()));
    }
}
