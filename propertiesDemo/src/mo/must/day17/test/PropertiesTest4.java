package mo.must.day17.test;

import mo.must.day17.domain.Student;

import java.io.*;
import java.util.Properties;

public class PropertiesTest4 {
    public static void main(String[] args) throws IOException {
        //从properties表中读取
        FileReader fr = new FileReader("propertiesDemo\\student.properties");
        Properties pps = new Properties();
        pps.load(fr);
        //封装为对象
        Student stu = new Student();
        stu.setName(pps.getProperty("name"));
        stu.setPassword(pps.getProperty("password"));
//        System.out.println(stu);
        //对象序列化
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream("propertiesDemo\\student.txt"));
        oop.writeObject(stu);
        oop.close();
    }
}
