package com.itheima.test.test10.test;

import com.itheima.test.test10.domain.Student;

import java.util.Collections;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student>treeSet = new TreeSet<>();
        /*
        姓名：吕布，学号：001，年龄：18
姓名：赵云，学号：002，年龄：19
姓名：典韦，学号：003，年龄：20
         */
        Student LvBu =new Student("LvBu",001,18);
        Student ZhaoYun = new Student("ZhaoYun",002,19);
        Student DianWei = new Student("DianWei",003,20);
        Collections.addAll(treeSet,LvBu,ZhaoYun,DianWei);
        for (Student s:treeSet){
            System.out.println(s);
        }
    }
}
