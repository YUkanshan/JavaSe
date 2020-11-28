package com.itheima.myThrow.myThrow02.test;

import com.itheima.myThrow.myThrow02.domain.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入姓名");
        String name  = sc.next();
        student.setName(name);
        while (true){
            System.out.println("请输入年龄");
            String ageSt = sc.next();
            try {
                int age = Integer.parseInt(ageSt);
                student.setAge(age);
                break;
            }catch (NumberFormatException e){
                System.out.println("请输入正确的年龄");
            }catch (RuntimeException e2){
                e2.printStackTrace();
            }
        }
        System.out.println(student);
    }
}
