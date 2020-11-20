package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    //创建数组容器
    private static Teacher[] teachers = new Teacher[5];

    public Teacher[] findAllTeacher() {
        return teachers;
    }

    //添加老师方法
    public boolean addTeacher(Teacher teacher) {
        //将对象存入数组
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                index = i;
                break;
            }
        }
        //若出循环index == -1,说明数组已被填满
        if (index == -1) {
            return false;
        } else {
            //数组未满,将对象存入数组
            teachers[index] = teacher;
            return true;
        }
    }

    //删除老师方法
    public void deleteTeacherById(String id) {
        int index = getIndex(id);
        teachers[index] = null;
    }

    //根据id获取数组索引
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    //修改老师方法
    public void updateStudent(String updateId, Teacher teacher) {
        //获取updateId所对应的数组索引位置
        int index = getIndex(updateId);
        //将该索引位置的学生对象修改
        teachers[index] = teacher;
    }
}
