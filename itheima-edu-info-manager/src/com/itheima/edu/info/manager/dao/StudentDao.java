package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    //创造一个空数组
    private static Student[] stuarray = new Student[5];

    public boolean addStudent(Student stu) {
        //判定数组中是否有null,也就是空位置,有的话讲传递过来的学生类放进去
        int index = -1;
        for (int i = 0; i < stuarray.length; i++) {
            Student student = stuarray[i];
            //判断当前送因为之元素是否为null
            if (student == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            stuarray[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return this.stuarray;
    }

    public void deleteStudentById(String delId) {
        //查找id在容器中所在的索引位置
        int index = getIndex(delId);
        stuarray[index]=null;
    }
    public int getIndex(String Id){
        //标记为思想,先假设要查找的id不存在
        int index = -1;
        //遍历数组容器
        for (int i = 0; i < stuarray.length; i++) {
            //拿到每一个学生对象
            Student stu=stuarray[i];
            if (stu!=null&&stu.getId().equals(Id)){
                index=i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String updateId,Student newStu) {
        //查找要修改的ID,在容器中的索引位置
        int index = getIndex(updateId);
        //将该索引位置,使用新的学生对象替换
        stuarray[index]=newStu;
    }
}
