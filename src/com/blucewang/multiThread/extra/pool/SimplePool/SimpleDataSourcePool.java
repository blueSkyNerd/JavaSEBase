package com.blucewang.multiThread.extra.pool.SimplePool;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * Created by bluceWang on 2017/12/27.
 */
public class SimpleDataSourcePool {
    private LinkedList<Connection> poolList  = new LinkedList<>();

    void SimpleDataSourcePool(int capacity){
        if(capacity>0){
            for (int i=0;i<capacity;i++){
                poolList.add(ConnectionDriver.createConnection());
            }
        }else{
            for (int i=0;i<10;i++){
                poolList.add(ConnectionDriver.createConnection());
            }
        }
    }
}
