package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    //创建一个老师对象
    Teacher newTeacher = new Teacher();
    //创建一个数组
    private static Teacher[] tcharray = new Teacher[5];

    //判定是否添加成功的方法
    public boolean addTeacher(Teacher tch) {
        //对数组进行遍历看是否有空位子,null
        int index = -1;
        for (int i = 0; i < tcharray.length; i++) {
            newTeacher = tcharray[i];
            if (newTeacher == null) {
                index = i;
                break;
            }
        }
        //对index进行判断,如果是-1则说明没有空位置,返回一个false
        //如果不说-1则说明有空位子,将老师对象放进去,并且返回一个true
        if (index == -1) {
            return false;
        } else {
            tcharray[index] = tch;
            return true;
        }
    }

    public Teacher[] findAllTeacher() {
        return tcharray;
    }

    public boolean deletTeacherById(String deleId) {
        int index = getIndex(deleId);
//根据索引删除数组此处的老师对象
        tcharray[index]=null;
        return  true;
    }

    //想要删除老师对象,就得知道老师对象所在的数组的索引
    //因此我们来创建一个方法,专门通过工号来获取索引
    public int getIndex(String Id) {
        //运用标记位思想,先假设索引不存在
        int index = -1;
        //遍历数组
        for (int i = 0; i < tcharray.length; i++) {
            Teacher tch = tcharray[i];//在每一个索引处创建一个老师对象
            if (tch != null && tch.getId().equals(Id)) {
                index = i;
                break;
            }
        }
        return index;
    }//这样就得到了一个能够快速找到索引的方法

    public Teacher[] AllTeacher() {
        return tcharray;
    }

    public void updateTeacher(String updateId, Teacher newTch) {
        //通过工号得到索引
        int index = getIndex(updateId);
        tcharray[index]=newTch;
    }
}
