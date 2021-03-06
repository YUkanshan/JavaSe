package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    //创建长度为5的学生数组
    private static Student[] students = new Student[5];
//运用静态代码块,先在数组前面塞两个学生对线
    static {
    Student stu1 =new Student("heima001","吴彦祖","23","1998");
    Student stu2 = new Student("heima002","彭于晏","24","1997");
        students[0]=stu1;
        students[1]=stu2;
    }

    //添加学生方法
    public boolean addStudent(Student stu) {
        //接收service层传来的学生对象,将其存入数组值不为null的索引处
        //判断数组的值是否为nll
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                break;
            }
        }
        //根据index的值判断是否将对象存入数组
        if (index == -1) {
            return false;
        } else {
            //index不为-1,则将对象存入
            students[index] = stu;
            return true;
        }
    }

    //删除学生方法
    public void deleteStudentById(String id) {
        //传输到dao的数据已经经过校验
        //获得id所在的索引
        int index = getIndexById(id);
        //删除索引处的元素
        students[index] = null;
    }

    //修改学生方法
    public void updateStudentById(String id, Student student) {
        //isExist方法已判断过学号问题,无需再次判断,数据可以传输到dao学号一定存在
        //找出id所对应的数组索引
        int index = getIndexById(id);
        //修改索引处学生对象
        students[index] = student;
    }

    //返回所有学生数据方法
    public Student[] findAllStudent() {
        return students;
    }

    //获得指定学号所对应的学生所在的数组的索引的方法
    public int getIndexById(String id) {
        int index = -1;
        //遍历数组
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && id.equals(students[i].getId())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
