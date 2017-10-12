package com.blucewang.classRelate.classLoad;

import sun.misc.Launcher;

import java.net.URL;

/**
 * Created by bluceWang on 2017/2/24.
 */
public class BootstrapTest {
    public static void main(String[] args) {
        //获取根加载器所加载的所有URL数组
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urLs.length; i++) {
            System.out.println(urLs[i].toExternalForm());
        }
    }

}
