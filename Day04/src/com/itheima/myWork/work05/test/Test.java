package com.itheima.myWork.work05.test;

import com.itheima.myWork.work05.domain.BaseTeacher;
import com.itheima.myWork.work05.domain.WorkTeacher;

public class Test {
    public static void main(String[] args) {
        BaseTeacher baseTeacher = new BaseTeacher("吴彦祖",23);
        WorkTeacher workTeacher = new WorkTeacher("彭于晏",25);
        baseTeacher.show();
        baseTeacher.teach();
        workTeacher.show();
        workTeacher.teach();

    }
}
