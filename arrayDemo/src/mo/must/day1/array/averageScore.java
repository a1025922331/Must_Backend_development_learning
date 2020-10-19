package mo.must.day1.array;

import java.util.Scanner;

public class averageScore {
    //静态成员常量
    final static int max = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[max][2];
//        System.out.print(array.length);

        //开始输入
        int enter;
        System.out.println("Please enter the scores of the student:(enter '-1' as the ending_sign");
        for (int i = 0; i < array.length; i++) {
            enter = sc.nextInt();
            if (enter < 0) {
                break;
            } else {
                array[i][0] = enter;
                array[i][1] = 1;
            }
        }

        double total = 0;
        int count = 0;
        for (int[] i : array) {
            if (i[1] == 1) {
                total += i[0];
                count++;
            }
        }

        System.out.println("the average score of the students is： " + total / count);
    }
}
