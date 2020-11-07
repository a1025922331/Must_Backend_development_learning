package mo.must.day5.manager.entry;

import mo.must.day5.manager.controller.StudentController;
import java.util.Scanner;
import static java.lang.System.exit;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到师生信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StudentController stuContro = new StudentController();
                    stuContro.start();
                    break;
                case 2:
                    //教师管理系统
                    break;
                case 3:
                    System.out.println("-------- 已安全退出当前正在运行的JVM虚拟机 --------");
                    exit(0);
            }

        }
    }

}
