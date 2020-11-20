package com.itheima.work.work06.domain;

public class Outer {
    public static Inter method() {
        //创建一个匿名内部类
        //对show进行重写
        return new Inter() {
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}
