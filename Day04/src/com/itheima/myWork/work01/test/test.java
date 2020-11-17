package com.itheima.myWork.work01.test;

import com.itheima.myWork.work01.domain.Student;

public class test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("吴彦祖");
        stu.setAge(23);
        stu.setBirthday("1998");
        stu.setSchool("清华带学");
        stu.getInfo();

    }
}

