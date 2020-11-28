package com.itheima.myThrow.myThrow02.domain;

public class Student {
    private String name ;
    private int age;
    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age>=18&&age<=25){
           this.age=age;
       }else {
           new RuntimeException("年龄超出了范围");
       }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}