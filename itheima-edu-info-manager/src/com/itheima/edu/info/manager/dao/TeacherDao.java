package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    //创建一个数组
    private static Teacher[] tcharray= new Teacher[5];
    //判定是否添加成功的方法
    public boolean addTeacher(Teacher tch) {
        //对数组进行遍历看是否有空位子,null
        int index=-1;
        Teacher newTeacher = new Teacher();
        for (int i = 0; i < tcharray.length; i++) {
             newTeacher = tcharray[i];
            if(newTeacher==null){
                index=i;
                break;
            }
        }
        //对index进行判断,如果是-1则说明没有空位置,返回一个false
        //如果不说-1则说明有空位子,将老师对象放进去,并且返回一个true
        if (index==-1){
            return false;
        }else {
            tcharray[index]=tch;
            return true;
        }
    }

    public Teacher[] findAllTeacher() {
        return  tcharray;
    }
}
