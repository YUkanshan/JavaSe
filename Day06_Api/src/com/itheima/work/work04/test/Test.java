package com.itheima.work.work04.test;

import com.itheima.work.work04.domain.Student;

public class Test {
    public static void main(String[] args) {
        Student[] stus1 = new Student[4];
        stus1[0] = new Student("吴彦祖", "23");
        stus1[1] = new Student("吴彦祖", "23");
        stus1[2] = new Student("柳岩", "24");
        stus1[3] = new Student("杨幂", "25");
//创建一个循环
        for (int i = 0; i < stus1.length; i++) {
            Student student = stus1[i];
            //对当前索引的对象和存放数组进行比较,看是否已经放进去过了
            int result = equalsByArr(student, stus1);
            if (result==1){
                System.out.println(student + "获得普通大礼包");
            }else {
                System.out.println(student + "获得缘分大礼包");
            }
        }
    }

    //判断之前的数组中的学生对象是否已经放进新数组中
    public static int equalsByArr(Student student, Student[] stus1) {
        //先假设没有相同的
        int index = 0;
        for (int i = 0; i < stus1.length; i++) {
            if (student.equals(stus1[i])) {
                index++;
            }
        }
        return index;
    }
}

