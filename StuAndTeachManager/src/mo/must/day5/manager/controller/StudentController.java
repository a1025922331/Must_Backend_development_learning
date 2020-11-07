package mo.must.day5.manager.controller;

import mo.must.day5.manager.domain.Student;
import mo.must.day5.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    Scanner sc = new Scanner(System.in);

    //创建业务员对象
    StudentService studentServie = new StudentService();

    //打开学生管理系统
    public void start() {
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    System.out.println("删除学生");
                    break;
                case 3:
                    System.out.println("修改学生");
                    break;
                case 4:
                    System.out.println("查看学生");
                    break;
                case 5:
                    return;
            }

        }
    }

    //添加学生
    public void addStudent() {
        String stuId;
        System.out.println("1.Please enter the student's ID: ");
        while(true){
            sc.nextLine();//空读
            stuId = sc.nextLine();
            if(studentServie.isExits(stuId))
                System.out.println("Hint: The Id you entered is occupied! Please other ID: ");
            else
                break;
        }
        Student stu = inputStudentInfo(stuId);
        boolean b = studentServie.addStudent(stu);
        if(b)
            System.out.println("Add successfully!");
        else
            System.out.println("Fail to add,Array is full.");
    }

    //键盘录入学号并判断学号是否存在
    private String inputStudentId() {
        System.out.println("1.Please enter the student's ID: ");
        String stuId = sc.nextLine();
        //循环并判断学号是否存在
        //........
        return stuId;
    }

    //键盘录入学生的其它信息
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