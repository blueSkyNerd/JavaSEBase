package com.blucewang.chapter18_io.practice;

import com.blucewang.net.mindview.util.TextFile;

import javax.management.RuntimeErrorException;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;

/**
 * Created by bluceWang on 2017/5/15.
 */
public class P1SerachWords {
    public static void main(String[] args) {
        File file = new File("src/com/blucewang/chapter18_io");
        String[] list = null;
        try {
            list = filterFileByWords("array", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String item :
                list) {
            System.out.println(item);
        }
    }

    private static String[] filterFileByWords(String words, File dir) throws Exception {
        if (!dir.isDirectory()) {
            throw new Exception("该文件不为目录");
        }
        if (words == null && "".equals(words)) {
            throw new Exception("匹配字符串不能为空");
        }
        String[] list = dir.list(new FilenameFilter() {
            private String ext = words.toLowerCase();
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith("java")) {
                    HashSet<String> strSet = new HashSet<>(new TextFile(new File(dir, name).getAbsolutePath(), "\\W+"));
                    for (String str :
                            strSet) {
                        if (str.toLowerCase().equals(ext)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        });
        return list;
    }
}
