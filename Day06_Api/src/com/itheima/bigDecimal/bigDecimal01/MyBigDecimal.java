package com.itheima.bigDecimal.bigDecimal01;

import java.math.BigDecimal;

public class MyBigDecimal {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("3.14");
        BigDecimal bd2 = new BigDecimal("5.34");
        System.out.println(bd1.divide(bd2));
    }
}
