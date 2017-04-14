package com.blucewang.chapter14.two;

/**
 * ��ȡClass�ķ�ʽ�м��֣�ͨ��getClass()������ȡ��ͨ������.class�ķ�ʽ��ȡ��ͨ��Class����.forName()��ʽ����ȡ
 *
 * Created by bluceWang on 2017/1/19.
 */
public class ToyTest {
    static  void printInfo(Class clazz){
        System.out.println("Class name " + clazz.getName()+" is interface? ["+clazz.isInterface()+"]");
        System.out.println("Simple name "+ clazz.getSimpleName());
        System.out.println("Cananical name " + clazz.getCanonicalName());
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        Class<?> toyClass=null;
        try {
            //��ӡ����Class��Ӧ����Ϣ
             toyClass= Class.forName("com.blucewang.chapter14.two.FancyToy");
            printInfo(toyClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //��ӡ����Classʵ�ֽӿڵ���Ϣ
        for(Class interfaceClazz : toyClass.getInterfaces()){
                printInfo(interfaceClazz);
        }
        //��ӡ����Class�̳и���ӿڵ���Ϣ
        Class<?> superclass = toyClass.getSuperclass();
        //ͨ��Class��ʵ��������
        Object instance = null;
        try {
            /**
             * ������ Class ��������ʾ�����һ����ʵ������ͬ��һ������һ���ղ����б�� new ���ʽʵ�������ࡣ���������δ��ʼ�������ʼ������ࡣ
             *ע�⣬�˷������� null ���췽�����׳����κ��쳣�������Ѽ����쳣��ʹ�ô˷���������Ч���ƹ�����ʱ���쳣��飬������������±���������ִ�иü�顣
             * Constructor.newInstance �������ù��췽�����׳����κ��쳣��װ��һ�����Ѽ��ģ�InvocationTargetException �У��Ӷ���������һ���⡣
             *	Class[] empty = {};
             * final Constructor<T> c = getConstructor0(empty, Member.DECLARED);
             * ��Ҫ�õ�Ĭ�ϵĹ��췽����û��Ĭ�ϵĹ��췽�����״�
             */
             instance = superclass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(instance.getClass());
    }

}
