package com.itheima.work_11_18.work05.domain;

public abstract class Sporter extends Person {
    public Sporter(){

    }
    public  Sporter(String name,int age){
        super(name,age);
    }
    public  abstract void study();//定义一个抽象的方法学习

}
