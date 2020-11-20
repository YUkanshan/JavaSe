package com.itheima.work_11_18.work02.domain;

public class Person {
    //姓名 工号 工资 奖金
    private String name;
    private int id;
    private double salary;//工资

    //构造方法
    public Person() {

    }

    public Person(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
