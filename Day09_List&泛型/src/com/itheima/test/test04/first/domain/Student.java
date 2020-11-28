package com.itheima.test.test04.first.domain;

public class Student implements Comparable<Student> {
    private String name;
    private String age;
    private int grade;


    public Student() {

    }

    public Student(String name, String age, int grade) {
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
                ", age='" + age + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.grade - o.grade;
        result = result == 0 ? this.age.compareTo(o.age) : result;
        return result;
    }
}
