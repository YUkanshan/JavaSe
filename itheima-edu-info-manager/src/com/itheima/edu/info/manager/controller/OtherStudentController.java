package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController {
    private Scanner sc = new Scanner(System.in);

    //键盘录入学生信息,返回一个学生对象
    @Override
    public Student inputInfo(String id) {
        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        System.out.println("请输入学生的年龄:");
        String age = sc.next();
        System.out.println("请输入学生的生日:");
        String birthday = sc.next();
        //使用带参构造方法封装学生对象
        Student student = new Student(id, name, age, birthday);
        return student;
    }
}
