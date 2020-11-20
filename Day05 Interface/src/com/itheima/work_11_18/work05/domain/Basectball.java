package com.itheima.work_11_18.work05.domain;

public class Basectball extends Sporter {
    public Basectball(){

    }
    public Basectball(String name,int age){
        super(name,age);
    }
    public void study(){
        System.out.println("我是篮球运动员,我爱学习");
    }
    public void eat(){
        System.out.println("我是篮球运动员,我每天吃很多东西");
    }
}
