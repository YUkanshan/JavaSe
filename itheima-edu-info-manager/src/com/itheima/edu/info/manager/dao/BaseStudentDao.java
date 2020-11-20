package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public interface  BaseStudentDao {
    //抽象添加学生功能
   boolean addStudent(Student stu);
    //抽象删除学生功能
    void deleteStudentById(String id);
    //抽象修改学生功能
    void updateStudentById(String id, Student student);
    //抽象返回所有学生数据方法
    Student[] findAllStudent();
    //获得指定学号所对应的学生所在的数组的索引的方法
    int getIndexById(String id);
}
