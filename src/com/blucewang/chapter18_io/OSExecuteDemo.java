package com.blucewang.chapter18_io;//: io/OSExecuteDemo.java
// Demonstrates standard I/O redirection.

import com.blucewang.net.mindview.util.OSExecute;

public class OSExecuteDemo {
  public static void main(String[] args) {
    OSExecute.command("javap D:\\soft\\code\\JavaSEBase\\src\\com\\blucewang\\chapter18_io\\OSExecuteDemo.java");
  }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
