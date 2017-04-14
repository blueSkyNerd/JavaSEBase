package com.blucewang.ClassRelate.ClassLoad;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * ？？
 *
 * Created by bluceWang on 2017/2/27.
 */
public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器："+systemClassLoader);

        /**
         * 获取系统类加载器的加载路径--通常由CLASSPATH环境变量指定
         * 如果操作系统没有指定CLASSPATH环境变量，则默认以当前路径作为系统类加载器的加载路径
         */
        Enumeration<URL> resources = systemClassLoader.getResources("");
        while(resources.hasMoreElements()){
            System.out.println(resources.nextElement());
        }

        //获取拓展类加载器
        ClassLoader extraClassLoader = systemClassLoader.getParent();
        System.out.println("拓展类加载器："+extraClassLoader);

        Enumeration<URL> extraClassLoaders = extraClassLoader.getResources("");
        while (extraClassLoaders.hasMoreElements()){
            System.out.println(extraClassLoaders.nextElement());
        }
        //JVM的根加载器不是java实现，而且由于程序通常无须访问根类加载器，因此访问拓展类加载器的父类加载器时返回null
        System.out.println("拓展类加载器的父类是："+extraClassLoader.getParent());
    }
}
