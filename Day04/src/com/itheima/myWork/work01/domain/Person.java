package com.itheima.myWork.work01.domain;

public class Person {
    private String name; // 姓名
    private int age; // 年龄
    private String birthday; // 生日

    //get  set
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // 获取信息的方法
    public String getInfo() {
        return "Person[name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
    }
}