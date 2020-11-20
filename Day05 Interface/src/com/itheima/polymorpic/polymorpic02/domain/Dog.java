package com.itheima.polymorpic.polymorpic02.domain;

public class Dog implements Animal {
    @Override
    public void eat(){
        System.out.println("我是狗类,狗吃肉");
    }
    public void run(){
        System.out.println("我是狗类特有的行为,我喜欢跑");
    }
}
