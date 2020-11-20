package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    //创建StudentService对象
    private StudentService service = new StudentService();
    private Scanner sc = new Scanner(System.in);

    //学生管理系统启动方法
    public final void start() {
        lo:
        while (true) {
            //学生管理系统菜单搭建
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");

            String choice = sc.next();
            switch (choice) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudentById();
                    break;
                case "4":
//                    System.out.println("查询学生");
                    queryStudents();
                    break;
                case "5":
                    System.out.println("感谢使用学生信息管理系统");
                    break lo;
                default:
                    System.out.println("您的输入有误");
            }
        }
    }

    //查询学生方法
    public final void queryStudents() {
        //调用service层的查询学生方法,返回一个学生数组
        Student[] students = service.queryStudents();
        //判断数组内是否存有学生对象
        if (students == null) {
            System.out.println("暂无学生信息,请检查后重试");
        } else {
            //遍历数组打印输出
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < students.length; i++) {
                Student stu = students[i];
                if (stu != null) {
                    System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
                }
            }
        }
    }

    //修改学生方法
    public final void updateStudentById() {
        //调用service层的查询学生方法,返回一个学生数组
        Student[] students = service.queryStudents();
        //判断数组内是否存有学生对象
        if (students == null) {
            System.out.println("暂无学生信息,请检查后重试");
            return;
        }
        //调用键盘录入方法录入id
        String id = inputStudentId(true);
        //调用键盘录入学生信息方法封装学生对象
        Student student = inputInfo(id);
        //将数据传出service层
        service.updateStudentById(id, student);
        System.out.println("修改学生成功");
    }

    //删除学生方法
    public final void deleteStudentById() {
        //调用service层的查询学生方法,返回一个学生数组
        Student[] students = service.queryStudents();
        //判断数组内是否存有学生对象
        if (students == null) {
            System.out.println("暂无学生信息,请检查后重试");
            return;
        }
        //调用键盘录入方法录入学号
        String id = inputStudentId(true);
        //将学号交给service层
        service.deleteStudentById(id);
        System.out.println("学生删除成功");
    }

    //添加学生方法
    public final void addStudent() {
       /* //StudentController的增加学生方法,用户交互并且封装数据传输给service层
        String id = null;
        while (true) {
            System.out.println("请输入学号:");
            id = sc.next();
            //加入学号是否存在的判断,调用service中调用isExist方法
            boolean exist = service.isExist(id);
            if (exist) {
                System.out.println("学号已存在,请重新输入");
            } else {
                break;
            }
        }*/
        String id = inputStudentId(false);
        Student student = inputInfo(id);
        //将封装后的学生对象传输给service层
        boolean result = service.addStudent(student);
        //根据返回值输出是否添加成功
        if (result) {
            System.out.println("添加学生成功");
        } else {
            System.out.println("添加学生失败");
        }
    }

    //键盘录入学生id的方法,返回键盘录入的id
    public final String inputStudentId(boolean flag) {
        String id = null;
        while (true) {
            System.out.println("请输入学号:");
            id = sc.next();
            boolean exist = service.isExist(id);
            if (exist != flag) {
                System.out.println("不符合要求的学号,请重新输入");
            } else {
                break;
            }
        }
        return id;
    }

    //键盘录入学生信息,返回一个学生对象
    public abstract Student inputInfo(String id);
}
