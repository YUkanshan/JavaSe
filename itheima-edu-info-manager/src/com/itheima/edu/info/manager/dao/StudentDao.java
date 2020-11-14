package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    //创造一个空数组
    private static Student[] stuarray = new Student[5];

    public boolean addStudent(Student stu) {
        //判定数组中是否有null,也就是空位置,有的话讲传递过来的学生类放进去
        int index = -1;
        for (int i = 0; i < stuarray.length; i++) {
            Student student = stuarray[i];
            //判断当前送因为之元素是否为null
            if (student == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            stuarray[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return this.stuarray;
    }
}
