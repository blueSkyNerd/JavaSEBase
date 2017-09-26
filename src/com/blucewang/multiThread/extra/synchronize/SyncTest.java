package com.blucewang.multiThread.extra.synchronize;

/**
 * Created by dongdaqing on 2017/9/20.
 */
class SyncPerson{
    private String name;

    private String age;

    public SyncPerson(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
public class SyncTest {
    public void changeName(SyncPerson person,String age){
        synchronized (person){
            System.out.println(Thread.currentThread().getName()+"原来的age："+person.getAge());
            person.setAge(age);
        }
        System.out.println(Thread.currentThread().getName()+"需要设置的age："+age);
    }

    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();
        SyncPerson syncPerson = new SyncPerson("wangyi", "200");
        for (int i=0;i<100;i++){
            final String age = String.valueOf(i);
            new Thread(()->syncTest.changeName(syncPerson,age),"thread"+String.valueOf(i)).start();
        }

    }

}
