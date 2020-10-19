package mo.must.day1.test1;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //生成随机数[1,100]的整数
        int num = r.nextInt(100) + 1;
        System.out.println("Please enter the number you want to guess?");
        int count = 0;

        //开始猜
        while (true) {
            int guess = sc.nextInt();
            count ++;
            if (guess < num) {
                System.out.println("too small, try again:");
            } else if (guess > num) {
                System.out.println("too big, try again:");
            } else {
                System.out.printf("Congratulations, after %d times guess you do it", count);
                break;
            }
        }
    }
}
