package com.itheima.test.test04.first.test;

import com.itheima.test.test04.first.domain.Student;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student Tom = new Student("Tom", "20", 90);
        Student Jerry = new Student("Jerry", "22", 95);
        Student John = new Student("John", "20", 100);
        Student Lily = new Student("Lily", "22", 100);
        Student Lucy = new Student("Lucy", "22", 90);
        Student Kevin = new Student("Kevin", "22", 90);
        Collections.addAll(treeSet, Tom, Jerry, John, Lily, Lucy, Kevin);
        for (Student stu : treeSet) {
            System.out.println(stu.toString());
        }
    }
}
