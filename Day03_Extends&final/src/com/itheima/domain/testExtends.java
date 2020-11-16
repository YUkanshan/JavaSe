package com.itheima.domain;

import com.itheima.domain.Chinese;

public class testExtends {
    public static void main(String[] args) {
        Chinese ch = new Chinese();//定义一个中国人类
        System.out.println(ch.getName());//首先我们输出中国人类的getName
        ch.setName("彭于晏");//接着我们改变中国人类的姓名
        //注意此时,中国人类里面空无一物,只有一个方法
        Aisan ai = new Aisan();//定义一个亚洲人类
//输出第一次改变姓名以后的中国人类姓名
        System.out.println(ch.getName());
        ch.method();//这也是一个方法重写
        System.out.println(ai.getName());//最后来来输出修改之后的亚洲人类姓名
        //以此来测试亚洲人类的姓名是否会跟着中国人类的改变而改变
    }
}
