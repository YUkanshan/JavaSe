package com.itheima.myWork.work03.domain;

public class Zi extends Fu {
    int num = 20;
    public Zi(){

    }
    //method方法
    public void method(){
        int num = 30;
        // 这里要求输出30
        System.out.println(num);
        // 这里要求输出20
        System.out.println(this.num);
        // 这里要求输出10
        System.out.println(super.num);
    }
}
