package com.itheima.work.work05.domain;

public class PingPong extends Sporter implements Inter {
    //构造方法
    public PingPong(){

    }
    public PingPong(String name,int age){
        super(name,age);
    }
    //重写抽象类中的方法
    public void eat(){
        System.out.println("我是乒乓球运动员,我每天吃很多东西");
    }
    public void study(){
        System.out.println("我是乒乓球运动员,我需要学习");
    }
    //重写接口中的方法
    public void studyEnglish(){
        System.out.println("我是乒乓球运动员,我需要学英语");
    }
}
