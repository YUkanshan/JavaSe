package com.itheima.Lambda.Lambda03.domain;

public class Student {
    private String name;
//构造方法
    public Student(){

    }
    public Student(String name) {
        this.name = name;
    }
    //get set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
