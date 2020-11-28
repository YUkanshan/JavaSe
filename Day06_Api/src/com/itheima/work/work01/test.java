package com.itheima.work.work01;

public class test {
    public static void main(String[] args) {
    Long star = System.currentTimeMillis();
        methodA();
        Long end = System.currentTimeMillis();
        System.out.println("程序运行的时间为:"+(end - star));
    }

    public static void methodA() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-1000之间的偶数和为：" + sum);
    }
}
