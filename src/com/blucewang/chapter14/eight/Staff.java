package com.blucewang.chapter14.eight;

import java.util.ArrayList;

import static javax.swing.text.html.HTML.Tag.P;

/**
 * Created by bluceWang on 2017/3/13.
 */
public class Staff extends ArrayList<Position>{
    public void add(String tittle,Person person){
        add(new Position(tittle,person));
    }

    public void add(String... tittles){
        for (String tittle:tittles){
            add(new Position(tittle));
        }
    }

    public void add(String tittle){
        add(new Position(tittle));
    }

    public boolean positionAvailabe(String title){
        //TODO žéÊ²üNß@‚€this´ú±íÁË arrayList<Position>
            for(Position position:this){
                if(position.getTittle().equals(title)&&position.getPerson()==Person.NULL){
                    return true;
                }
            }
            return false;
    }

    public void fillPosition(String title,Person hirePerson){
        if(hirePerson==null){
            throw new RuntimeException("can't not hire a fade person");
        }
        for (Position position:this){
            if(position.getTittle().equals(title)&&position.getPerson()==Person.NULL){
                position.setPerson(hirePerson);
                return;
            }
        }
        throw new RuntimeException("can't find the position!");
    }

    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.add("project leader","project manager","soft programmer","cto","hr");
        staff.fillPosition("project leader",new Person("me","wang","location one "));
        if(staff.positionAvailabe("cto")){
            staff.fillPosition("cto",new Person("bluce","hu","location two"));
        }
        staff.fillPosition("soft programmer",new Person("king","wu","location three"));
        System.out.println(staff);
    }
}
