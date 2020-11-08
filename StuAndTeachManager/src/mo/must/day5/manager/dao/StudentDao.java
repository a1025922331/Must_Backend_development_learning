package mo.must.day5.manager.dao;

import mo.must.day5.manager.domain.Student;

//data access object 数据访问对象
public class StudentDao implements BaseStudentDao{
    private static Student[] stus = new Student[5];

    //静态代码块
    static{
        Student stu1 = new Student("2016180099","guozexin",22,"19980101");
        Student stu2 = new Student("2016180098","libinqian",22,"19980102");
        stus[0] = stu1;
        stus[1] = stu2;
    }

    //添加学生信息
    @Override
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

    //查看所有学生
    @Override
    public Student[] findAllStudent() {
        return stus;
    }

    //删除学生信息
    @Override
    public void deleteStudentById(String stuId) {
        int index = getIndex(stuId);
        stus[index] = null;
    }

    //按stuId查找并返回索引
    @Override
    public int getIndex(String stuId) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stus[i] != null && stus[i].getId().equals(stuId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    //修改学生信息
    @Override
    public void updateStudent(String stuId, Student newStu) {
        int index = getIndex(stuId);
        stus[index] = newStu;
    }
}