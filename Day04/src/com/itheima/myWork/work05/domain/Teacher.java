package com.itheima.myWork.work05.domain;

public abstract class Teacher {
    private String name;
    private int age;

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
    //非抽象方法
    public void show(){
        System.out.println(getName() + "老师" + "..." + getAge() + "岁");
    }

    //定义抽象方法teach
    public abstract void teach();

}
