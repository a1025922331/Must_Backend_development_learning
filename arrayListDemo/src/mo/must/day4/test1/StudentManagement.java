package mo.must.day4.test1;

import mo.must.day4.domain.StudentInfo;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //创建集合容器对象
        ArrayList<StudentInfo> studentList = new ArrayList<>();
        int choice;

        loop1:
        while (true) {
            //显示主界面
            System.out.println("=========== 欢迎来到学生管理系统 ==========");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查看学生");
            System.out.println("5. 退出系统");
            System.out.println("=======================================");

            //引导user选择
            System.out.print("请选择您要进行的操作：");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("========== 添加学生 ==========");
                    addStudent(studentList);
                    break;
                case 2:
                    System.out.println("========== 删除学生 ==========");
                    deleteStudent(studentList);
                    break;
                case 3:
                    System.out.println("========== 修改学生 ==========");
                    setStudent(studentList);
                    break;

                case 4:
                    System.out.println("========== 查看学生 ==========");
                    displayStudent(studentList);
                    break;
                case 5:
                    System.out.println("已安全退出！");
                    break loop1;
                default:
                    System.out.println("您输入的选项有误！");
            }
        }
    }

    //修改学生信息：使用ArrayList.set(index,object)来改，
    // 重新创建一个元素对象比直接改对象的成员变量要快
    public static void setStudent(ArrayList<StudentInfo> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要的修改的学生学号：");
        String sid = sc.next();
        int index = indexOf(studentList, sid);
        if (index == -1)
            System.out.println("无此学生信息，请确认后重试！");
        else {
            System.out.print("请输入姓名：");
            String name = sc.next();
            System.out.print("请输入年龄：");
            int age = sc.nextInt();
            System.out.print("请输入生日：");
            String birthday = sc.next();

            //封装StudentInfo类
            StudentInfo student = new StudentInfo(sid, name, age, birthday);
            studentList.set(index, student);
            System.out.println("成功修改学生信息！");
        }
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<StudentInfo> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要的删除的学生学号：");
        String sid = sc.next();
        int index = indexOf(studentList, sid);
        if (index == -1)
            System.out.println("无此学生信息，请确认后重试！");
        else {
            studentList.remove(index);
            System.out.println("成功删除！");
        }
    }

    //查看学生信息
    public static void displayStudent(ArrayList<StudentInfo> studentList) {
        if (studentList.size() == 0) {
            System.out.println("暂无学生信息，请尝试添加学生信息！");
            return;
        }
        //打印表头
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t生日");

        //遍历集合容器，打印学生信息
        for (StudentInfo student : studentList) {
            System.out.println(student.getSid() + "\t" + student.getName()
                    + "\t" + student.getAge() + "\t\t" + student.getBirthday());
        }
    }

    //添加学生信息
    public static void addStudent(ArrayList<StudentInfo> studentList) {

        Scanner sc = new Scanner(System.in);

        String sid;
        String name;
        int age;
        String birthday;
        int index;

        //提示录入: 带检查重复的功能
        while (true) {
            System.out.print("请输入学号：");
            sid = sc.next();
            index = indexOf(studentList, sid);
            if (index == -1)
                break;
            else
                System.out.println("已存在该学生的信息，请确认后重试！");
        }
        System.out.print("请输入姓名：");
        name = sc.next();
        System.out.print("请输入年龄：");
        age = sc.nextInt();
        System.out.print("请输入生日：");
        birthday = sc.next();

        //封装StudentInfo类
        StudentInfo student = new StudentInfo(sid, name, age, birthday);
        studentList.add(student);
        System.out.println("添加学生信息成功！");
    }

    //查找索引，找不到返回-1
    public static int indexOf(ArrayList<StudentInfo> student, String sid) {
        //初始化-1
        int index = -1;
        //查找
        for (int i = 0; i < student.size(); i++) {
            if (sid.equals(student.get(i).getSid())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
