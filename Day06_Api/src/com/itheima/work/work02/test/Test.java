package com.itheima.work.work02.test;

import com.itheima.work.work02.domain.Person;

public class Test {
    public static void main(String[] args) {
        // 创建对象，并初始化数据
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);
        // 输出对象中数据
        System.out.println(p1.toString());
        System.out.println(p2);
    }
}
