package com.blucewang.classRelate.classLoad;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * ����
 *
 * Created by bluceWang on 2017/2/27.
 */
public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException {
        //��ȡϵͳ�������
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("ϵͳ���������"+systemClassLoader);

        /**
         * ��ȡϵͳ��������ļ���·��--ͨ����CLASSPATH��������ָ��
         * �������ϵͳû��ָ��CLASSPATH������������Ĭ���Ե�ǰ·����Ϊϵͳ��������ļ���·��
         */
        Enumeration<URL> resources = systemClassLoader.getResources("");
        while(resources.hasMoreElements()){
            System.out.println(resources.nextElement());
        }

        //��ȡ��չ�������
        ClassLoader extraClassLoader = systemClassLoader.getParent();
        System.out.println("��չ���������"+extraClassLoader);

        Enumeration<URL> extraClassLoaders = extraClassLoader.getResources("");
        while (extraClassLoaders.hasMoreElements()){
            System.out.println(extraClassLoaders.nextElement());
        }
        //JVM�ĸ�����������javaʵ�֣��������ڳ���ͨ��������ʸ������������˷�����չ��������ĸ��������ʱ����null
        System.out.println("��չ��������ĸ����ǣ�"+extraClassLoader.getParent());
    }
}
