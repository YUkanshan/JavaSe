package com.itheima.myWork.work01.domain;

public class Student extends Person {
    private String school; // 所在学校

    //无参构造
    public Student() {

    }
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    // 获取信息的方法
    public String getInfo() {
        return "Student[name=" + getName() + ", age=" + getAge() + ", birthday=" + getBirthday() + ", school=" + school + "]";
    }
}
