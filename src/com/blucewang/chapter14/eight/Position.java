package com.blucewang.chapter14.eight;

/**
 * Created by bluceWang on 2017/3/13.
 */
public class Position {
    private String tittle;

    private Person person;

    public Position(String tittle, Person person) {
        this.tittle = tittle;
        this.person = person;
        if (person==null){
            this.person=Person.NULL;
        }
    }

    public Position(String tittle) {
        this.tittle = tittle;
        this.person=Person.NULL;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        //TODO 这段代码有什么用
        if(person==null){
           this.person=Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "tittle='" + tittle + '\'' +
                ", person=" + person +
                '}';
    }
}
