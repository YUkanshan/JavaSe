package com.itheima.work.work01.test;

import com.itheima.work.work01.domain.Fu;
import com.itheima.work.work01.domain.Zi;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.num);
        fu.method();
       Zi zi = (Zi)fu;
       zi.show();
    }
}
