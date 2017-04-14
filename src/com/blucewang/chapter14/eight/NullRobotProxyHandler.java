package com.blucewang.chapter14.eight;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 *獲取被代理類的實際類型名稱
 * Created by bluceWang on 2017/3/14.
 */
public class NullRobotProxyHandler implements InvocationHandler {

    private String nullName;

    private Robot proxied = new NRobot();

    public NullRobotProxyHandler(Class<? extends Robot> type) {
        this.nullName = type.getSimpleName()+" nullRobotName";
    }

    private class NRobot implements Null,Robot{

        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }
}
