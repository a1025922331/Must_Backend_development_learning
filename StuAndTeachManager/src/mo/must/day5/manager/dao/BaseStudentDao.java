package mo.must.day5.manager.dao;

import mo.must.day5.manager.domain.Student;

//data access object 数据访问对象
public abstract class BaseStudentDao {
    private static Student[] stus = new Student[5];

    //静态代码块
    static{
        Student stu1 = new Student("2016180099","guozexin",22,"19980101");
        Student stu2 = new Student("2016180098","libinqian",22,"19980102");
        stus[0] = stu1;
        stus[1] = stu2;
    }

    //添加学生信息
    public abstract boolean addStudent(Student stu);

    //查看所有学生
    public abstract Student[] findAllStudent();

    //删除学生信息
    public abstract void deleteStudentById(String stuId);

    //按stuId查找并返回索引
    public abstract int getIndex(String stuId);

    //修改学生信息
    public abstract void updateStudent(String stuId, Student newStu);
}