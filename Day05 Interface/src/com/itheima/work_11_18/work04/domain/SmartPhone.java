package com.itheima.work_11_18.work04.domain;

public class SmartPhone extends Phone {
    public SmartPhone(){

    }
    public SmartPhone(String brand,int price){
        super(brand,price);
    }
    @Override
    public void call(){
        super.call();
        System.out.println("视频通话");
    }
}
