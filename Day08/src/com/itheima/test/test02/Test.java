package com.itheima.test.test02;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (RuntimeException r) {
            r.printStackTrace();
        }
        System.out.println("我是后续程序的代码");
    }
}
