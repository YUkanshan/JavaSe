package com.itheima.myWork.work05.domain;

public class BaseTeacher extends Teacher {
    public BaseTeacher(String name,int age){
        setName(name);
        setAge(age);
    }
    @Override
    public void teach() {
        System.out.println("基础班老师在讲Java");
    }
}
