package mo.must.day5.manager.dao;

import mo.must.day5.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher[] teachers = new Teacher[5];

    //添加老师信息
    public boolean addTeacher(Teacher teacher) {
        int index = -1;

        //判断是否有空位
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            //有空位
            teachers[index] = teacher;
            return true;
        } else {
            //没空位
            return false;
        }
    }

    //查看所有老师
    public Teacher[] findAllTeacher() {
        return teachers;
    }

    //删除老师信息
    public void deleteTeacherById(String id) {
        int index = getIndex(id);
        teachers[index] = null;
    }

    //按id查找并返回索引
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teachers[i] != null && teachers[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    //修改老师信息
    public void updateTeacher(String id, Teacher newTeacher) {
        int index = getIndex(id);
        teachers[index] = newTeacher;
    }
}
