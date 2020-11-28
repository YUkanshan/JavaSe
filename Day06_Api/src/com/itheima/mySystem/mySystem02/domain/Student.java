package com.itheima.mySystem.mySystem02.domain;

import java.util.Objects;

public class Student {
    private String name;
    private String age;

 public Student(){

 }
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }
}
