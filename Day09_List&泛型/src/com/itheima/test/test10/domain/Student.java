package com.itheima.test.test10.domain;

public class Student implements Comparable<Student> {
    private String name;
    private int ID;
    private int age;

    public Student() {
    }

    public Student(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.ID - o.ID;

        result = result == 0 ?Integer.valueOf(this.age).compareTo(Integer.valueOf(o.age)):result;
        return result;
    }
}
