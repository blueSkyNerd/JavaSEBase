package com.blucewang.chapter14.eight;

import java.lang.reflect.Proxy;

/**
 * Created by bluceWang on 2017/3/14.
 */
public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type){
        return (Robot) Proxy.newProxyInstance(type.getClassLoader(),new Class[]{Null.class,Robot.class},new NullRobotProxyHandler(type));
    }

    public static void main(String[] args) {
        Robot[] robots = new Robot[]{
            new SnowRemovalRobot("KiddingTwo"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for (Robot robot: robots
             ) {
            Robot.Test.test(robot);
        }
    }
}
