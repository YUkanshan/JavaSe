package com.itheima.Lambda.Lambda03.test;

import com.itheima.Lambda.Lambda03.domain.Inter;
import com.itheima.Lambda.Lambda03.domain.Student;

public class Test {
    //将接口中的唯一方法进行重写,目的是运用方法时,实参放入一个姓名
    //将姓名直接返回,
    public static void main(String[] args) {
        showStudent( (name)->name);
    }

    public static void showStudent(Inter inter) {
        //以多态接口的方式放入一个匿名创建的实现类lambda
        //如上文所说,这个Lambda的作用就是放入name 返回name
        //所以此时的inter.show是带有一个返回值,最后进行打印
        String name = inter.show("吴彦祖");
        System.out.println(name);
    }
}
