package com.itheima.test.test03.test;

import com.itheima.test.test03.domain.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("请输入姓名");
        String name = sc.next();
        person.setName(name);
        while (true) {
            System.out.println("请输入年龄");
            try {
                String age = sc.next();
                int inage = Integer.parseInt(age);
               // int age = sc.nextInt();
                person.setAge(inage);
                break;
            }catch (NumberFormatException nu){
                System.out.println("对不起,请输入正确年龄");
            }
        }
        System.out.println(person);
    }
}
