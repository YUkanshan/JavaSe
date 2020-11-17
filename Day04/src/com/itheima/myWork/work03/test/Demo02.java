package com.itheima.myWork.work03.test;

public class Demo02 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }

    static class Fu {
        int num = 10;
    }
}

class Zi extends Demo02.Fu {
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
