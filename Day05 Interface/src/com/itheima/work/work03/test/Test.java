package com.itheima.work.work03.test;

import com.itheima.work.work03.domain.Inter;

public class Test {
    public static void main(String[] args) {
//运用lambda
        //创建一个匿名实现类对象,重写method方法打印这句话
        show(()->System.out.println("我是method方法"));
    }
    //创建一个方法,将接口放入,分别进行Num打印和method的使用
    public static void show(Inter inter){
        System.out.println(inter.num);
        inter.method();
    }
}
