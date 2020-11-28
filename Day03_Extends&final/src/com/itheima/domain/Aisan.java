package com.itheima.domain;

public class Aisan extends Person {
    //加上静态来测试亚洲人类和中国人类是否公用一个姓名
    private static String name;//="吴彦祖";//加上静态来测试亚洲人类和中国人类是否公用一个姓名
    public Aisan(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* protected void method(){//权限比人类要大
        super.method();//引用人类的方法
        System.out.println("我是亚洲人");
    }*/
}
