package com.blucewang.chapter7;

/**
 *
 * Created by bluceWang on 2017/2/21.
 */
public class BlankFinal {
    private final int i = 0;
    private final  int j;
    private final Poppet poppet;

    public BlankFinal() {
        j=1;
        poppet =  new Poppet("poppetOne");
    }

    public BlankFinal(String poppetName){
        j=2;
        poppet = new Poppet(poppetName);
    }

    @Override
    public String toString() {
        return "j:"+j+" poppetName="+poppet.poppetName;
    }

    public static void main(String[] args) {
        BlankFinal blankFianl1 = new BlankFinal();
//        blankFianl.j=3;
        BlankFinal blankFianl2 = new BlankFinal("poppetTwo");
        System.out.println(blankFianl1);
        System.out.println(blankFianl2);
    }
}
