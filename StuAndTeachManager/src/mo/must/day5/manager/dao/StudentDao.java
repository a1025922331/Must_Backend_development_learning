package mo.must.day5.manager.dao;

import mo.must.day5.manager.domain.Student;

//data access object 数据访问对象
public class StudentDao {
    private static Student[] stus = new Student[5];

    //添加学生信息
    public boolean addStudent(Student stu) {
        int index = -1;

        //判断是否有空位
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            //有空位
            stus[index] = stu;
            return true;
        } else {
            //没空位
            return false;
        }
    }
}