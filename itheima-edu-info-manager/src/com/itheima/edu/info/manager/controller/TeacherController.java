package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    //创建TeacherService层对象
    private TeacherService service = new TeacherService();
    private Scanner sc = new Scanner(System.in);

    //老师管理系统启动方法
    public void start() {

        teacherLoop:
        while (true) {
            //学生管理系统菜单搭建
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");

            String choice = sc.next();
            switch (choice) {
                case "1":
//                    System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
//                    System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
//                    System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
//                    System.out.println("查询老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢使用老师信息管理系统");
                    break teacherLoop;
                default:
                    System.out.println("您的输入有误");
            }
        }
    }

    //修改老师方法
    public void updateTeacher() {
        //先判断数组内是否有对象
        Teacher[] teachers = service.findAllTeacher();
        if (teachers == null) {
            //若容器中没有数据,给出提示信息并且结束当前方法
            System.out.println("暂无信息,请检查后重试");
            return;
        }
        //接收用户输入的id
        String updateId = inputTeacherId();
        //接收用户录入的其他信息并且封装数据
        Teacher teacher = inputInfo(updateId);
        //调用service层的修改老师方法
        service.updateTeacher(updateId, teacher);
        System.out.println("修改成功");
    }

    //删除老师方法
    public void deleteTeacherById() {
        //先判断数组内是否有对象
        Teacher[] teachers = service.findAllTeacher();
        if (teachers == null) {
            //若容器中没有数据,给出提示信息并且结束当前方法
            System.out.println("暂无信息,请检查后重试");
            return;
        }
        //先让客户录入需要删除的学号
        String id = inputTeacherId();
        service.deleteTeacherById(id);
        System.out.println("删除成功");
    }

    //查询老师方法
    public void findAllTeacher() {
        //查询前先判断容器中是否有数据
        Teacher[] teachers = service.findAllTeacher();
        if (teachers == null) {
            System.out.println("暂无信息,请检查后重试");
        } else {
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < teachers.length; i++) {
                Teacher teacher = teachers[i];
                if (teacher != null) {
                    System.out.println(teacher.getId() + "\t" + teacher.getName() + "\t" + teacher.getAge() + "\t\t" + teacher.getBirthday());
                }
            }
        }
    }

    //添加老师方法
    public void addTeacher() {
        String id = null;
        while (true) {
            System.out.println("请输入老师的工号:");
            id = sc.next();
            //校验id是否存在
            boolean result = service.isExist(id);
            if (result) {
                System.out.println("工号已存在,请检查后输入");
            } else {
                break;
            }
        }
        //封装老师对象
        Teacher teacher = inputInfo(id);
        //将老师对象传输到service
        boolean result = service.addTeacher(teacher);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

    //键盘录入id方法
    public String inputTeacherId() {
        String id = null;
        while (true) {
            System.out.println("请输入老师的工号:");
            id = sc.next();
            //校验id是否存在
            boolean result = service.isExist(id);
            if (!result) {
                System.out.println("工号不存在,请检查后输入");
            } else {
                break;
            }
        }
        return id;
    }

    //键盘录入老师信息
    //键盘录入老师信息,返回一个老师对象
    public Teacher inputInfo(String id) {
        System.out.println("请输入老师的姓名:");
        String name = sc.next();
        System.out.println("请输入老师的年龄:");
        String age = sc.next();
        System.out.println("请输入老师的生日:");
        String birthday = sc.next();
        //封装老师对象
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);
        return teacher;
    }
}
