package com.itheima.Lambda.Lambda02.test;

import com.itheima.Lambda.Lambda02.domin.Calculator;

public class Test {
    public static void main(String[] args) {
        useCalculator((int a, int b) -> {
            return (a + b);
        });
    }

    public static void useCalculator(Calculator calculator) {
        int result = calculator.calc(10, 20);
        System.out.println(result);
    }
}
