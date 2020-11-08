package mo.must.day5.manager.dao;

import mo.must.day5.manager.domain.Student;

import java.util.ArrayList;

//data access object 数据访问对象
public class OtherStudentDao extends BaseStudentDao{
    private static ArrayList<Student> stus = new ArrayList<>();

    //静态代码块
    static{
        Student stu1 = new Student("2016180099","guozexin",22,"19980101");
        Student stu2 = new Student("2016180098","libinqian",22,"19980102");
        stus.add(stu1);
        stus.add(stu2);
    }

    //添加学生信息
    @Override
    public boolean addStudent(Student stu) {
        stus.add(stu);
        return true;
    }

    //查看所有学生
    @Override
    public Student[] findAllStudent() {
        Student[] stusToArray = new Student[stus.size()];
        for (int i = 0; i < stus.size(); i++) {
            stusToArray[i] = stus.get(i);
        }
        return stusToArray;
    }

    //删除学生信息
    @Override
    public void deleteStudentById(String stuId) {
        int index = getIndex(stuId);
        stus.remove(index);
    }

    //按stuId查找并返回索引
    @Override
    public int getIndex(String stuId) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if (stu.getId().equals(stuId)) {
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
        stus.set(index,newStu);
    }
}