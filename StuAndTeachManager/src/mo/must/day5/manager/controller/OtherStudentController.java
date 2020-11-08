package mo.must.day5.manager.controller;

import mo.must.day5.manager.domain.Student;
import mo.must.day5.manager.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{

    Scanner sc = new Scanner(System.in);

    //键盘录入学生的其它信息
    @Override
    public Student inputStudentInfo(String stuId) {
        System.out.println("2.Please enter the student's name: ");
        String name = sc.nextLine();
        System.out.println("3.Please enter the student's age: ");
        int age = sc.nextInt();
        System.out.println("2.Please enter the student's birthday: ");
        sc.nextLine();//空读
        String birthday = sc.nextLine();
        Student stu = new Student(stuId, name, age, birthday);
        return stu;
    }
}