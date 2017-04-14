package com.blucewang.chapter14.eight;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bluceWang on 2017/3/14.
 */
public class SnowRemovalRobot implements Robot {
    private String name;

    public SnowRemovalRobot(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "snow robot serial 11";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(new Operation() {
            @Override
            public String desription() {
                return name + "can remove snow";
            }

            @Override
            public void command() {
                System.out.println(name + "removing snow");
            }
        }, new Operation() {
            @Override
            public String desription() {
                return name + "can chip ice";
            }

            @Override
            public void command() {
                System.out.println(name + "chipping ice");
            }
        }, new Operation() {
            @Override
            public String desription() {
                return name + "can clear road";
            }

            @Override
            public void command() {
                System.out.println(name + "clear road");
            }
        });
    }

    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("KiddingOne"));
    }
}
