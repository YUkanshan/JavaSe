package com.itheima.work.work04.test;

import com.itheima.work.work04.domain.SmartPhone;

public class Test {
    public static void main(String[] args) {
        SmartPhone o = new SmartPhone("大米",2000);
        System.out.println("品牌：" + o.getBrand() + ",价格：" + o.getPrice() + ",尺寸：" + o.getSize());
        o.call();
        o.sendMessage();
    }
}
