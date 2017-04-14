package com.blucewang.chapter7;

import java.util.Random;

/**
 * final�ؼ��ֵ�����:
 * 1.һ������ʱ����ϣ���ı�ĳ���
 * 2.����ʱ����ʼ����ֵ������ϣ�������ı�
 * Created by bluceWang on 2017/2/21.
 */
public class FinalData {
    private static Random rand = new Random(50);

    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne=1;

    private static final int VALUE_TWO=2;

    public static final int VALUE_THREE=3;

    private final int i4 = rand.nextInt(20);

    private static final int INT_5=rand.nextInt(20);

    private Value v1=new Value(11);

    private final Value v2=new Value(22);

    private static final Value VAL_3=new Value(33);

    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return id+": "+"i4= "+i4+", INT_5 = "+ INT_5;
    }

    public static void main(String[] args) {
        FinalData idOne = new FinalData("idOne");
//        idOne.valueOne++;//����ֵ���ܱ��
//        idOne.v2 = new Value(44);//����final���ζ��󣬱�ʾ�����ǹ̶���
        idOne.v2.i++;//���ò��䣬��������ָ��Ķ�����������
        for(int i=0;i<idOne.a.length;i++){
            idOne.a[i]++;//���� Ҳ��һ������final�ؼ������Σ���ʾ���ò��䣬��������ָ��������ǿ����������
        }
//        idOne.v2=new Value(22);//���ܱ������
//        idOne.VAL_3= new Value(1);//ͬ��
//        idOne.a = new int[1];//ͬ��
        /***
         *1.final ���ε�ֵ��������ʱ����ʼ����
         * 2.static ��ֵ���ڵ�һ�������ʱ����ʼ����������ÿ�δ�������ʱ����
         */
        System.out.println(idOne);
        System.out.println("create new FinalData");
        FinalData idTwo = new FinalData("idTwo");
        System.out.println(idOne);
        System.out.println(idTwo);
        /**
         idOne: i4= 8, INT_5 = 17
         create new FinalData
         idOne: i4= 8, INT_5 = 17
         idTwo: i4= 13, INT_5 = 17
         */
    }
}
