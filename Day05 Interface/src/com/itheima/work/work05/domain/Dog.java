package com.itheima.work.work05.domain;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome() {
        System.out.println("狗看家");
    }
}

