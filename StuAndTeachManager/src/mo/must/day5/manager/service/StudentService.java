package mo.must.day5.manager.service;

import mo.must.day5.manager.dao.StudentDao;
import mo.must.day5.manager.domain.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    //判断学号是否存在
    public boolean isExits(String stuId) {
        boolean isExist = false;
        Student[] stus = studentDao.findAllStudent();
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            //避免空指针异常，要加个判断是否为null的条件
            if(stu!=null&&stu.getId().equals(stuId)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    //添加学生
    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    //查看所有学生
    public Student[] findAllStudent() {
        return studentDao.findAllStudent();
    }

    //删除学生信息
    public void deleteStudentById(String stuId) {
        studentDao.deleteStudentById(stuId);
    }

    //修改学生信息
    public void updateStudent(String stuId, Student newStu) {
        studentDao.updateStudent(stuId,newStu);
    }
}
