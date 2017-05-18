package com.blucewang.chapter18_io.practice;

import java.io.IOException;
import java.util.List;

/**
 * Created by bluceWang on 2017/5/17.
 */
public class P10PrintFilterFile {

    public static void main(String[] args) throws IOException {
        args=new String[2];
        args[0]="D:\\soft\\code\\JavaSEBase\\src\\com\\blucewang\\chapter18_io\\practice\\P7BackOutFile.java";
        args[1]="file";
        if(args.length<2){
            System.err.println("参数至少要接收两个以上");
        }

        for (int i=1;i<args.length;i++){
            List<String> list = P7BackOutFile.getLineListByFile(args[0]);
            if(list!=null&&!list.isEmpty()){
                String str = args[i];
                list.forEach((string)->{
                    if(string.contains(str)){
                        System.out.println(string);
                        return;
                    }
                });
            }else{
                break;
            }
        }

    }


}
