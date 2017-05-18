package com.blucewang.chapter18_io.practice;

import com.blucewang.net.mindview.util.Directory;
import com.blucewang.net.mindview.util.ProcessFiles;

import java.io.File;
import java.io.IOException;

/**
 * Created by bluceWang on 2017/5/16.
 */
public class P5RegxProcessFiles {
    public interface Strategy {
        void process(File file);
    }

    private ProcessFiles.Strategy strategy;
    private String regx;

    public P5RegxProcessFiles(ProcessFiles.Strategy strategy, String regx) {
        this.strategy = strategy;
        this.regx = regx;
    }

    public void start(String[] args) {
        try {
            if (args.length == 0)
                processDirectoryTree(new File("."));
            else
                for (String arg : args) {
                    File fileArg = new File(arg);
                    if (fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
                        // Allow user to leave off extension:
                        if(arg.matches(regx))
                        strategy.process(
                                new File(arg).getCanonicalFile());
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void
    processDirectoryTree(File root) throws IOException {
        for (File file : Directory.walk(
                root.getAbsolutePath(), ".*\\." + regx))
            strategy.process(file.getCanonicalFile());
    }

    // Demonstration of how to use it:
    public static void main(String[] args) {
        args=new String[1];
        args[0] = "D:\\soft\\code\\JavaSEBase\\src\\com\\blucewang\\chapter18_io\\extra";
        new ProcessFiles(new ProcessFiles.Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        }, "*.java").start(args);
    }
} /* (Execute to see output) *///:~
