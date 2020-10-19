package mo.must.day1.array;

import java.util.Scanner;

public class judgesScoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //假设有6个评委
        int[] score_array = new int[6];
        int max = 0;
        int min = 100;
        int score_temp = 0;
        double total = 0;
        System.out.println("please enter the sore from judges(full mark is 10):");
        for (int i = 0; i < 6; i++) {
            score_temp = sc.nextInt();
            if (score_temp < min)
                min = score_temp;
            else if (score_temp > max)
                max = score_temp;
            total += score_temp;
            score_array[i] = score_temp;
        }
        System.out.println("after excluding the maximum and minimum,the average score is " + (total - min - max) / 4);

    }
}
