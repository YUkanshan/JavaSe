package com.itheima.work_11_18.work01.test;

import com.itheima.work_11_18.work01.domain.Student;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("吴彦祖",23);
        System.out.println(stu.getName() + "..." + stu.getAge() + "岁");
    }
}
