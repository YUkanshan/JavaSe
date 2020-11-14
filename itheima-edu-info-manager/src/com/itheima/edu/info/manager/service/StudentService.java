package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    //对从StudentController传递过来的学生对象进行判定,学号是否唯一
    //并将不唯一的学生对象传递给StudenDao,但是暂时不涉及判定
    //因此仅仅将学生对象传递即可
    StudentDao dao = new StudentDao();      //创建一个StudentDao对象
    public boolean addStudent(Student stu) {
        //如上述所说,将传递到此处的学生对象传递到StudentDao中
        //同理先假设一个StudentDao类中的addStudent方法
        //同时接受从Dao中传递过来的真假值
        boolean result = dao.addStudent(stu);
        return result;
    }

    public boolean isExists(String id) {
        //指挥库管将数据仓库里所有的学生信息都拿过来
        Student[] allStudent = dao.findAllStudent();
        //判断库管返回的数组中有没有学生的学号和我这次要筛选的学号一直
        //先假设没人学号跟我一样
        boolean exists = false;
        //遍历数组
        for (int i = 0; i < allStudent.length; i++) {
            //拿到每一个学生
            Student stu =allStudent[i];
            //只有当前数组索引位置 学生对象不为Null并且这个学生和我们的学号一致时
            if (stu!=null&&stu.getId().equals(id)){
                //这个时候我们的学号确实是重复了
                exists= true;
                break;
            }
        }//最后返回exisits
        return  exists;
    }
}
