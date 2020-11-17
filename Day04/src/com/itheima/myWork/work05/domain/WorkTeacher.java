package com.itheima.myWork.work05.domain;

public class WorkTeacher  extends Teacher{
    public WorkTeacher(String name,int age){
        setName(name);
        setAge(age);
    }
    @Override
    public void teach(){
        System.out.println("就业班老师在讲Java");
    }
}
