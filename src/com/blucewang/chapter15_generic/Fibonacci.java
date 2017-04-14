package com.blucewang.chapter15_generic;

/**
 * 第一项和第二项为2，第三项开始每一项都等于前面两项之和
 * Created by bluceWang on 2017/3/28.
 */
public class Fibonacci implements Generator<Integer> {

    private int count=0;

    @Override
    public Integer next() {
        return fibonacci(count++);
    }

    private Integer fibonacci(int i) {
        if(i<2){
            return 1;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i=0;i<18;i++){
            System.out.println(fibonacci.fibonacci(i));
        }
    }
}
