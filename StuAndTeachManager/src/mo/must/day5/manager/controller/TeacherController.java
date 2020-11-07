package mo.must.day5.manager.controller;

import mo.must.day5.manager.domain.Teacher;
import mo.must.day5.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {

    Scanner sc = new Scanner(System.in);

    //创建业务员对象
    TeacherService teacherService = new TeacherService();

    //打开学生管理系统
    public void start() {
        while (true) {
            System.out.println("--------welcome to teacher management system--------");
            System.out.println("please enter your choice: 1.add teacher  2.delete teacher  3.revise teacher 4.check teacher  5.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    deleteTeacherById();
                    break;
                case 3:
                    updateTeacher();
                    break;
                case 4:
                    findAllTeacher();
                    break;
                case 5:
                    return;
            }

        }
    }

    //添加学生信息
    public void addTeacher() {
        String id;
        System.out.println("1.Please enter the teacher's ID: ");
        sc.nextLine();//空读
        while (true) {
            id = sc.nextLine();
            if (teacherService.isExits(id))
                System.out.println("Hint: The Id you entered is occupied! Please other ID: ");
            else
                break;
        }
        Teacher teacher = inputTeacherInfo(id);
        boolean b = teacherService.addTeacher(teacher);
        if (b)
            System.out.println("Add successfully!");
        else
            System.out.println("Fail to add,Array is full.");
    }

    //删除学生信息
    public void deleteTeacherById() {
        String id = inputTeacherId();
        teacherService.deleteTeacherById(id);
    }

    //修改学生信息
    public void updateTeacher() {
        String id = inputTeacherId();
        Teacher newTeacher = inputTeacherInfo(id);
        teacherService.updateTeacher(id, newTeacher);
    }

    //查看所有学生
    public void findAllTeacher() {
        Teacher[] teachers = teacherService.findAllTeacher();
        boolean isEmpty = true;
        System.out.println("ID\t\tname\t\tage\tbirthday");
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null) {
                isEmpty = false;
                System.out.printf("%s\t%s\t%d\t%s\n", teacher.getId(),
                        teacher.getName(), teacher.getAge(), teacher.getBirthday());
            }
        }

        if (isEmpty)
            System.out.println("None teacher information!");


    }

    //键盘录入学号（含判断id是否存在）
    private String inputTeacherId() {
        String id;
        System.out.println("1.Please enter the teacher's ID: ");
        sc.nextLine(); //空读一行

        //若不存在则重新输入
        while (true) {
            id = sc.nextLine();
            if (teacherService.isExits(id))
                break;
            else {
                System.out.println("Hint: The ID entered does not exits! Please enter again: ");
            }
        }
        return id;
    }

    //键盘录入学生的其它信息
    public Teacher inputTeacherInfo(String id) {
        System.out.println("2.Please enter the teacher's name: ");
        String name = sc.nextLine();
        System.out.println("3.Please enter the teacher's age: ");
        int age = sc.nextInt();
        System.out.println("2.Please enter the teacher's birthday: ");
        sc.nextLine();//空读
        String birthday = sc.nextLine();
        Teacher teacher = new Teacher(id, name, age, birthday);
        return teacher;
    }
}
