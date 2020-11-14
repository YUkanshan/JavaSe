package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public void star() {
        Scanner sc = new Scanner(System.in);
        //建立一个死循环,因为不确定用户的使用次数
        lo:
        while (true) {
            System.out.println("------欢迎使用老师管理系统------");
            System.out.println("1.添加老师,2.删除老师,3.修改老师,4.查询老师,5.退出");
            //让用户进行选择,然后再依靠选择来进行选项判断
            String choice = sc.next();
            //展开一个switch选择
            switch (choice) {
                case "1":
                    //System.out.println("添加");
                    //运用teacher类中的方法,将其进行传递
                    addTeacher();
                    break;
                case "2":
                    System.out.println("删除");
                    break;
                case "3":
                    System.out.println("修改");
                    break;
                case "4":
                    System.out.println("查询");
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您输入的选项有误,请重新输入");
                    break;
            }
        }
    }

    public void addTeacher() {
        //创建并封装一个老师对象
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {

            System.out.println("请输入工号");
             id = sc.next();
             //指挥业务员,让他去给我们判断工号是否唯一
            //首先要定义一个业务员对象
            TeacherService teacherService = new TeacherService();
            //调用业务员类中的判断方法
            boolean exists = teacherService.isExists(id);
            //对结果进行判断
            if (exists){
                break;
            }else {
                System.out.println("对不起,您的工号重复");
                System.out.println("----------------------");
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String brithday = sc.next();
        //封装一个老师对象
        Teacher tch = new Teacher(id, name, age, brithday);
        //将这个老师对象传递至业务员处
        //并且返回一个添加是否成功的通知
        //创建一个业务员对象以用来调用方法
        TeacherService teacherService = new TeacherService();
        boolean result = teacherService.addTeacher(tch);
        //将这个返回的值 进行判断,
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("对不起,添加失败");
        }


    }
}
