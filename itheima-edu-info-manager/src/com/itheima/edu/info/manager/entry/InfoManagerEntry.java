package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.OtherStudentController;
import com.itheima.edu.info.manager.controller.TeacherController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //主菜单搭建
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
//                    System.out.println("学生信息管理");
//                    StudentController studentController = new StudentController();
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                    break;
                case "2":
//                    System.out.println("老师信息管理");
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢使用,再见");
                    //退出当前正在运行的JVM虚拟机
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");
            }
        }
    }
}
