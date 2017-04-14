package com.blucewang.chapter14.eight;

import java.util.List;

/**
 * Created by bluceWang on 2017/3/14.
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();

    class Test {
        public static void test(Robot r){
            if(r instanceof Null){
                System.out.println("[null robot]");

            }
            System.out.println("Robot name: "+ r.name());
            System.out.println("Robot model: "+r.model());
            for(Operation operation:r.operations()){
                System.out.println(operation.desription());
                operation.command();
            }

        }
    }
}
