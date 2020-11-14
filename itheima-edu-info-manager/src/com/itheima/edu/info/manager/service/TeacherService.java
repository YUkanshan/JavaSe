package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    //将老师对象传递至仓库员那里
    TeacherDao teacherDao = new TeacherDao();

    public boolean addTeacher(Teacher tch) {

        boolean result = teacherDao.addTeacher(tch);
        return result;
    }

    public boolean isExists(String id) {
        //接受从仓库那边传递过来的数组
        Teacher[] allTeacher = teacherDao.findAllTeacher();
        boolean exists = true;
        //使用遍历方法对id唯一性进行判定
        for (int i = 0; i < allTeacher.length; i++) {
            //创建一个老师对象,用get来提取id
            Teacher tch = allTeacher[i];
            //判定条件,当前索引位置的数组不为Null同时学号重复时
            if (allTeacher[i] != null && tch.getId().equals(id)) {
                //这种情况便是学号重复了
                exists = false;
            }

        }
        return exists;
    }
}
