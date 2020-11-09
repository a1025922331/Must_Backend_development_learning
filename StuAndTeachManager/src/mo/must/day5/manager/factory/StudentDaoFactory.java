package mo.must.day5.manager.factory;

import mo.must.day5.manager.dao.BaseStudentDao;
import mo.must.day5.manager.dao.OtherStudentDao;
import mo.must.day5.manager.dao.StudentDao;

//用多态来解耦
public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
        //return new StudentDao();
    }
}
