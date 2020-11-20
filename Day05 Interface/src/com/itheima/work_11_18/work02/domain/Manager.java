package com.itheima.work_11_18.work02.domain;

public class Manager extends Person {
    private double bounce;
    //构造方法
    public Manager(){

    }
    public Manager(String name,int age,double salary,double bounce){
        super(name,age,salary);
        this.bounce = bounce;
    }
//奖金的get set
    public double getBounce() {
        return bounce;
    }

    public void setBounce(double bounce) {
        this.bounce = bounce;
    }
    //定义work方法
    public void work(){
        System.out.println(super.getName() + "...工号为:" + super.getId() + "工资为" + super.getSalary() + "奖金为" + getBounce() + "的项目经理");

    }
}
