package mo.must.day5.manager.controller;

import mo.must.day5.manager.domain.Student;
import mo.must.day5.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {

    Scanner sc = new Scanner(System.in);

    //创建业务员对象
    StudentService studentServie = new StudentService();

    //打开学生管理系统
    public final void start() {
        while (true) {
            System.out.println("--------welcome to student management system--------");
            System.out.println("please enter your choice: 1.add stu  2.delete stu  3.revise stu 4.check stu  5.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudentById();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    findAllStudent();
                    break;
                case 5:
                    return;
            }

        }
    }

    //添加学生信息
    public final void addStudent() {
        String stuId;
        System.out.println("1.Please enter the student's ID: ");
        sc.nextLine();//空读
        while (true) {
            stuId = sc.nextLine();
            if (studentServie.isExits(stuId))
                System.out.println("Hint: The Id you entered is occupied! Please other ID: ");
            else
                break;
        }
        Student stu = inputStudentInfo(stuId);
        boolean b = studentServie.addStudent(stu);
        if (b)
            System.out.println("Add successfully!");
        else
            System.out.println("Fail to add,Array is full.");
    }

    //删除学生信息
    public final void deleteStudentById() {
        String stuId = inputStudentId();
        studentServie.deleteStudentById(stuId);
    }

    //修改学生信息
    public final void updateStudent() {
        String stuId = inputStudentId();
        Student newStu = inputStudentInfo(stuId);
        studentServie.updateStudent(stuId,newStu);
    }

    //查看所有学生
    public final void findAllStudent() {
        Student[] stus = studentServie.findAllStudent();
        boolean isEmpty = true;
        System.out.println("stuID\t\tname\t\tage\tbirthday");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {
                isEmpty = false;
                System.out.printf("%s\t%s\t%d\t%s\n", stu.getId(),
                        stu.getName(), stu.getAge(), stu.getBirthday());
            }
        }

        if (isEmpty)
            System.out.println("None student information!");


    }

    //键盘录入学号（含判断id是否存在）
    private String inputStudentId() {
        String stuId;
        System.out.println("1.Please enter the student's ID: ");
        sc.nextLine(); //空读一行

        //若不存在则重新输入
        while (true) {
            stuId = sc.nextLine();
            if (studentServie.isExits(stuId))
                break;
            else {
                System.out.println("Hint: The stuID entered does not exits! Please enter again: ");
            }
        }
        return stuId;
    }

    //键盘录入学生的其它信息
    public abstract Student inputStudentInfo(String stuId);
}