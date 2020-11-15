package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    //将老师对象传递至仓库员那里
    TeacherDao teacherDao = new TeacherDao();
//添加老师方法
    public boolean addTeacher(Teacher tch) {

        boolean result = teacherDao.addTeacher(tch);
        return result;
    }

    //这个方法是用来判断传递过来的工号是否存在
    public boolean isExists(String id) {
        //接受从仓库那边传递过来的数组
        Teacher[] allTeacher = teacherDao.AllTeacher();
        boolean exists = false;
        //使用遍历方法对id唯一性进行判定
        for (int i = 0; i < allTeacher.length; i++) {
            //创建一个老师对象,用get来提取id
            Teacher tch = allTeacher[i];
            //判定条件,当前索引位置的数组不为Null同时学号重复时
            if (tch != null && tch.getId().equals(id)) {
                //这种情况便是学号重复了
                exists = true;
                break;
            }

        }
        return exists;
    }

    //删除老师方法
    public boolean deletTeacherById(String deleId) {
        //将删除依据工号删除老师对象的工号传递给仓库处
        //并将删除是否成功的结果返回给客服
        boolean result = teacherDao.deletTeacherById(deleId);
        return result;
    }

    //将仓库数组那边的所有老师对象都接受过来
    //其中会进行判定,如果只要数组中有一个老师对象的存在,便可以接受这个数组
    //相反,按照常理来讲,如果数组中全部为空,那么传递数组变没有意义
    public Teacher[] findTeacher() {
        //将仓库处的数组传递过来
        Teacher[] tch = teacherDao.AllTeacher();
        boolean result = false;//用标记为思想,先判定穿过来的数组为空
        //进行遍历
        for (int i = 0; i < tch.length; i++) {
            if (tch[i] != null) {
                result = true;
                break;
            }
        }
        if (result) {
            return tch;
        } else {
            return null;
        }
    }

    //删除老师方法
    public void updateTeacher(String updateId, Teacher newTch) {
        //将要修改的老师的工号和新的对象信息传递给仓库
        teacherDao.updateTeacher(updateId, newTch);
    }
}
