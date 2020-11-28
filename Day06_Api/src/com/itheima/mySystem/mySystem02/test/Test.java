package com.itheima.mySystem.mySystem02.test;

import com.itheima.mySystem.mySystem02.domain.Student;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("吴彦祖","23");
        Student stu1=  new Student("彭于晏","24");
        System.out.println(stu.equals(stu1));
    }
}
