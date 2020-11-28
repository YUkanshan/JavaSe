package com.itheima.test.test05.test.style02.test;

import com.itheima.test.test05.test.style02.domain.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //Tom 20 90 Jerry 22 95 John 20 100 Lily 22 100 Lucy 22 90 Kevin 22 90
        TreeSet<Student> treeSet = new TreeSet<>(
               (Student o1, Student o2) ->{
                        int result = o2.getGrade() - o1.getGrade();
                   result = result == 0 ? o2.getAge() - o1.getAge():result;
                        return result;
                    });
        Student Tom = new Student("Tom", 20, 90);
        Student Jerry = new Student("Jerry", 20, 100);
        Student John = new Student("John", 20, 100);
        Student LiLy = new Student("LiLy", 22, 100);
        Student Lucy = new Student("Lucy", 22, 90);
        Student Kevin = new Student("Kevin", 22, 90);
        Collections.addAll(treeSet, Tom, Jerry, John, LiLy, Lucy, Kevin);
        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}