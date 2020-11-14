package mo.must.day8;

import java.util.Scanner;

public class ExceptionTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("Please enter student's name:");
        String name = sc.nextLine();
        stu.setName(name);

        while (true) {
            System.out.println("Please enter student's age:");
            String ageStr = sc.nextLine();

            try {
                int age = Integer.parseInt(ageStr);
                stu.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number.");
                continue;
            } catch(AgeOverTheRangeException a) {
                a.printStackTrace();
            }

        }
        System.out.println(stu);
    }


}