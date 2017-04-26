package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/18.
 */
public class P9 {
    /***
     * ����һ���Խӿڵ����ã������Խӿڵ�ʵ���ܹ���ȫ���ɼ������Ҳ����á����������ʵ��ϸ��
     * @param name
     * @return
     */
    public HelloInterface p9Hello(String name){
        class P9Hello implements HelloInterface{
            private String name;

            public P9Hello(String name) {
                this.name = name;
            }

            @Override
            public void sayHello() {
                System.out.println(name+" say hello");
            }
        }
        return new P9Hello(name);
    }

    public static void main(String[] args) {
        P9 p9 = new P9();
        HelloInterface p91 = p9.p9Hello("p9");
        p91.sayHello();
    }
}
