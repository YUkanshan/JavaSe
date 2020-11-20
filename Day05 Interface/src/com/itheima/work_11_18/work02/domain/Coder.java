package com.itheima.work_11_18.work02.domain;

public class Coder extends Person {
    public Coder(){

    }
    public Coder(String name,int age,double salary){

    }
    //定义work方法
    public void work(){
        System.out.println(super.getName() + "...工号为:" + super.getId() + "工资为" + super.getSalary() + "的程序员");

    }
}
