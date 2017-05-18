package com.blucewang.chapter18_io.practice;

import com.blucewang.net.mindview.util.Directory;

/**
 * Created by bluceWang on 2017/5/16.
 */
public class P4SumDirectoryFiles {
    public long sumFile(String pathName,String regx){
        Directory.TreeInfo treeInfo = Directory.walk(pathName, regx);
        return treeInfo.files.size();
    }


}
