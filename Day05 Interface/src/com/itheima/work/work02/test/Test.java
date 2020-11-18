package com.itheima.work.work02.test;

import com.itheima.work.work02.domain.Coder;
import com.itheima.work.work02.domain.Manager;
import javafx.concurrent.Worker;

public class Test {
    public static void main(String[] args) {

        Coder cd = new Coder("彭于晏",124,8000);
        cd.work();
    }
}
