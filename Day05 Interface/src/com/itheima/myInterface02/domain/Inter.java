package com.itheima.myInterface02.domain;

public interface Inter {
    int NUM=10;
    void show();
    public default void show01(){
        System.out.println("我是接口的默认方法");
    }
}
