package mo.must.day5.manager.service;

import mo.must.day5.manager.dao.TeacherDao;
import mo.must.day5.manager.domain.Teacher;


public class TeacherService {
    TeacherDao teacherDao = new TeacherDao();

    //判断学号是否存在
    public boolean isExits(String id) {
        boolean isExist = false;
        Teacher[] teachers = teacherDao.findAllTeacher();
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            //避免空指针异常，要加个判断是否为null的条件
            if(teacher!=null&&teacher.getId().equals(id)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    //添加老师
    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    //查看所有老师
    public Teacher[] findAllTeacher() {
        return teacherDao.findAllTeacher();
    }

    //删除老师信息
    public void deleteTeacherById(String id) {
        teacherDao.deleteTeacherById(id);
    }

    //修改老师信息
    public void updateTeacher(String id, Teacher newTeacher) {
        teacherDao.updateTeacher(id,newTeacher);
    }
}
