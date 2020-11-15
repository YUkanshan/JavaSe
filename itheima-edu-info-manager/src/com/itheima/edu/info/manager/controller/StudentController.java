package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);

    public void star() {


        lo:
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1.添加学生,2.删除学生,3.修改学生,4.查询学生,5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    // System.out.println("删除");
                    deleteStudentById();
                    break;
                case "3":
                    // System.out.println("修改");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("查询");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您的使用,再见");
                    break lo;

            }
        }
    }

    //添加学生
    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        String id;
        //加入学号是否存在的判断
        //职回业务员去帮我们校验以下当前用户录入的学号是否村咋
        while (true) {//使用无限循环,让用户一直输入学号,直至学号正确为止
            System.out.println("请输入学号");
            id = sc.next();

            boolean exists = studentService.isExists(id);//在业务员层面返回一个判断结果
            //根据业务员返回的结果进行判断
            if (exists) {
                System.out.println("当前学号已存在,请重新输入");
            } else {
                //false,说明学号不存在,可以用,就让用户往下输入其他信息
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String brithday = sc.next();
        //将输入的学生各类信息封装为一个学生类
        Student stu = new Student(id, name, age, brithday);
        //将封装的学生传递给StudentService
        //首先先创建一个StudentServeice对象
        StudentService studentService = new StudentService();
        //其次运用到一个StudentService中的addStudent方法,注意,此时该方法还并没有定义
        boolean result = studentService.addStudent(stu);
        //接下来对addStudent传递过来的结果进行一个判断,倘若学生信息添加成功,那么result会传递过来一个true
        if (result) {
            System.out.println("学生信息添加成功");
        } else if (result == false) {
            System.out.println("对不起,学生信息添加失败");
        }
    }

    //查询方法
    public void findAllStudent() {
        Student[] stus = studentService.findAllStudent();
        //判断数组的内存地址,是否为Null
        if (stus == null) {
            System.out.println("差无信息,请添加后重试");
            return;
        }
        //遍历数组,获取学生信息并打印在控制台
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {//这个NULL测验可以避免空指针异常
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBrithday());

            }
        }
    }

    //删除学生方法
    public void deleteStudentById() {
        //接受用户录入的要删除的学生id
        System.out.println("请输入要删除的学生Id:");
        String delId;
        while (true) {
            delId = sc.next();
            //调用业务员的判断id是否存在方法,对用户录入的id进行校验
            boolean exists = studentService.isExists(delId);
            if (exists) {
                break;
            } else {
                //不存在让用户重新录入
                System.out.println("当前id不存在,请重新输入");
            }
        }
        studentService.deletstStudentById(delId);
        System.out.println("删除成功");
    }

    //修改学生方法
    public void updateStudent() {
        //接受要修改的学生学号
        System.out.println("请输入要修改的学生id:");
        String updateId;
        while (true) {
            updateId = sc.next();
            //调用业务员的判断id是否岑在方法,对用户录入的id进行校验
            boolean exists = studentService.isExists(updateId);
            if (exists) {
                break;
            } else {
                //不存在,就就让用户重新录入
                System.out.println("当前id不存在,请重新输入:");
            }
        }
        //接受新的学生信息封装成新的学生对象
        System.out.println("请输入新姓名");
        String name = sc.next();
        System.out.println("请输入新年龄");
        String age = sc.next();
        System.out.println("请输入新出生日期");
        String birthday = sc.next();
        //进行封装
        Student newStu = new Student();
        newStu.setId(updateId);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBrithday(birthday);
        //将封装好的学生ID以及学生对象传递给业务员
        studentService.upStudent(updateId, newStu);
        //给出修改成功的提示
        System.out.println("修改成功");
    }
}

