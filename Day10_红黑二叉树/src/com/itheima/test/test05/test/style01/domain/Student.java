package com.itheima.test.test05.test.style01.domain;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int grade;

    public Student(String 小红, int i) {
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = o.grade - this.grade;
        result = result == 0 ? o.age - this.age : result;
        if (result == 0) {
            result += 1;
        }
        return result;
    }
}
