package mo.must.day5.manager.entry;

import mo.must.day5.manager.controller.StudentController;
import mo.must.day5.manager.controller.TeacherController;
import java.util.Scanner;
import static java.lang.System.exit;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------welcome to the information management system--------");
            System.out.println("please enter your choice: 1.student  2.teacher  3.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case 2:
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case 3:
                    System.out.println("-------- the JVM has exited --------");
                    exit(0);
                default:
                    System.out.println("Your input is wrong, please try again!");
            }

        }
    }

}
