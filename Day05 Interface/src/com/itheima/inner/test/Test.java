package com.itheima.inner.test;

import com.itheima.inner.domain.Inter;

public class Test {
    public static void main(String[] args) {
        new Inter(){
            @Override
            public void show(){
                System.out.println("我是重写过后的匿名内部类");
            }
        }.show();
    }
}
