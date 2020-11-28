package com.itheima.test.test04.second.test;

import com.itheima.test.test04.second.domain.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(
                (Student o1, Student o2) -> {
                    int result = o1.getGrade() - o2.getGrade();
                    result = result == 0 ? o1.getAge().compareTo(o2.getAge()) : result;
                    return result;
                });
        Student Tom = new Student("Tom", "20", 90);
        Student Jerry = new Student("Jerry", "22", 95);
        Student John = new Student("John", "20", 100);
        Student Lily = new Student("Lily", "22", 100);
        Student Lucy = new Student("Lucy", "22", 90);
        Student Kevin = new Student("Kevin", "22", 90);
        Collections.addAll(treeSet,Tom,Jerry,John,Lily,Lucy,Kevin);
        for (Student stu:treeSet){
            System.out.println(stu);
        }
    }
}

