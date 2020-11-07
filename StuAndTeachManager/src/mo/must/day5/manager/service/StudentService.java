package mo.must.day5.manager.service;

import mo.must.day5.manager.dao.StudentDao;
import mo.must.day5.manager.domain.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    //判断学号是否存在
    public boolean isExits(String stuId) {
        return false;
    }

    //添加学生
    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }
}
