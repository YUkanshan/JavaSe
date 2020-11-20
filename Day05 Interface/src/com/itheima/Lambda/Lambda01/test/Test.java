package com.itheima.Lambda.Lambda01.test;

import com.itheima.Lambda.Lambda01.domain.ShowHandler;

public class Test {
    public static void main(String[] args) {
        useShowHandler(() -> { System.out.println("我是Lambda中重写的show方法"); });
    }
    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }
}
