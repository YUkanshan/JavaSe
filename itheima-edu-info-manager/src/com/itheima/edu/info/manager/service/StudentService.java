package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.factory.StudentDaoFctory;

public class StudentService {
    private BaseStudentDao studentDao = StudentDaoFctory.getStudentDao();

    //添加学生方法
    public boolean addStudent(Student stu) {
        //将StudentController传递过来的学生对象传输到Dao层
        boolean result = studentDao.addStudent(stu);
        return result;
    }

    //删除学生方法
    public void deleteStudentById(String id) {
        //将学生id传输给Dao层
        studentDao.deleteStudentById(id);
    }

    //修改学生方法
    public void updateStudentById(String id, Student student) {
        //传输数据到dao层
        studentDao.updateStudentById(id, student);
    }

    //校验学号是否存在方法
    public boolean isExist(String id) {
        //需要Dao返回完整数据进行判断,findAllStudents方法
        Student[] students = studentDao.findAllStudent();
        //遍历数组将传入的id与数组中每个学生的id进行比较
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    //查询学生方法,需要返回一个学生对象数组
    public Student[] queryStudents() {
        Student[] allStudent = studentDao.findAllStudent();
        //先假设数组为空
        boolean flag = false;
        //遍历判断
        for (int i = 0; i < allStudent.length; i++) {
            if (allStudent[i] != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allStudent;
        } else {
            return null;
        }
    }
}
