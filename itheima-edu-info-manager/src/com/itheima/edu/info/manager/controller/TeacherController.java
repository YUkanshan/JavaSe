package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.StudentService;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    Scanner sc = new Scanner(System.in);
    //创建一个业务员对象以用来调用方法
    TeacherService teacherService = new TeacherService();

    public void star() {

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
                    //System.out.println("删除");
                    deletTeacherById();
                    break;
                case "3":
                    //System.out.println("修改");
                    updateTeacher();
                    break;
                case "4":
                    //System.out.println("查询");
                    findTeacher();
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

    //添加老师对象方法
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
            if (!exists) {
                break;
            } else {
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

        boolean result = teacherService.addTeacher(tch);
        //将这个返回的值 进行判断,
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("对不起,添加失败");
        }
    }

    //删除老师对象方法
    public void deletTeacherById() {
        //输入想要删除的学生学号
        System.out.println("请输入想要删除的学生学号");
        String deleId;
        //建立一个死循环,知道用户输入的想要删除的学号是真实存在的位置
        while (true) {
            deleId = sc.next();
            //判断输入的学号是否存在
            //运用在业务员那里的判定方法
            boolean exists = teacherService.isExists(deleId);
            if (!exists) {
                System.out.println("对不起您输入的学号不存在");
            } else {
                break;
            }
        }
        //将输入的学号传递给业务员
        StudentService studentService = new StudentService();
        //运用业务员层面的删除方法,将想要删除的学生学号传递进去
        //并将是否删除成功的信息传递上来
        boolean result = teacherService.deletTeacherById(deleId);
        if (result) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    //查询老师方法
    public void findTeacher() {
        //创建一个数组接受从后面传递过来的老师数组
        Teacher[] tcharray = teacherService.findTeacher();
        //首先先判断传递过来的数组是否没有任何老师资料
        if (tcharray == null) {
            System.out.println("对不起,暂无信息");
            return;
        }
        System.out.println("工号\t\t姓名\t年龄\t生日");
        //将接受过来的数组进行遍历,然后进行打印展示
        for (int i = 0; i < tcharray.length; i++) {
            Teacher tch = tcharray[i];
            if (tcharray[i] != null) {
                tch = tcharray[i];
                System.out.println(tch.getId() + "\t" + tch.getName() + "\t" + tch.getAge() + "\t" + tch.getBrithday());
            }
        }

    }


    //修改老师方法
    public void updateTeacher() {
        //首先便是通过死循环让用户输入有效的工号

        String updateId;
        while (true) {
            System.out.println("请输入需要修改的老师的工号");
            updateId = sc.next();
//通过业务员的isExists方法来判断工号是否存在
            boolean exists = teacherService.isExists(updateId);
            if (!exists) {
                System.out.println("对不起,工号不存在");
            } else {
                break;
            }
        }
        //接下来输入新的姓名,年龄,生日
        System.out.println("请输入新的姓名");
        String name = sc.next();
        System.out.println("请输入新的年龄");
        String age = sc.next();
        System.out.println("请输入新的生日");
        String brithday = sc.next();
        //将新的信息封装成老师对象
        Teacher newTch = new Teacher();
        newTch.setId(updateId);
        newTch.setAge(age);
        newTch.setBrithday(brithday);
        newTch.setName(name);
        //将封装好的新的老师信息转递给业务员
        teacherService.updateTeacher(updateId, newTch);
        System.out.println("修改成功");

    }
}