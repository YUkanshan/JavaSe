package com.itheima.domain;

public class Chinese extends Aisan {

    @Override
    public void method(){//权限比亚洲人类要大
        super.method();//引用亚洲人类的方法
        System.out.println("我是中国人");
    }
}
