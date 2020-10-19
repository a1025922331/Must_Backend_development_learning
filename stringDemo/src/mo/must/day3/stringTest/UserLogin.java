package mo.must.day3.stringTest;

import java.util.Scanner;

public class UserLogin {
    public static void main(StringBuilderTest[] args) {
        String username = "a1025922331";
        String password = "12345678";
        Scanner sc = new Scanner(System.in);

        System.out.print("账号：");
        String scUsername = sc.nextLine();
        System.out.print("密码: ");
        String scPassword = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            //注意：对于引用类型而言，==判断的是地址，equals()才是判断字符串内容是否相同
            if (username.equals(scUsername) && password.equals(scPassword)) {
                System.out.println("==================================");
                System.out.println("登录成功！");
                System.out.println("==================================");
                break;
            } else if (i == 2) {
                System.out.println("==================================");
                System.out.println("您的账号已被限制登陆，请明日再试！");
                System.out.println("==================================");
            } else {
                System.out.println("==================================");
                System.out.printf("您输入的账号或密码有误，您还有%d次机会,请确认后重新输入!\n", 2 - i);
                System.out.println("==================================");
                System.out.print("账号：");
                scUsername = sc.nextLine();
                System.out.print("密码: ");
                scPassword = sc.nextLine();
            }
        }
    }
}
