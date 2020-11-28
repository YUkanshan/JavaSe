package com.itheima.work.work03.test;

import com.itheima.work.work03.domain.Person;

public class Test {
    public static void main(String[] args) {
        // 创建对象，并初始化数据
        Person p1 = new Person("张三",23);
        Person p2 = new Person("张三",23);
        // 比较两个对象
        System.out.println(p1.equals(p2));
    }
}
