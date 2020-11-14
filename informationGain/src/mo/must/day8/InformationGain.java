package mo.must.day8;

import java.awt.event.WindowFocusListener;
import java.util.Arrays;
import java.util.Scanner;


public class InformationGain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入子元组集的个数：");
        int subsetNumber = sc.nextInt();
        System.out.print("请输入类别的个数：");
        int classNumber = sc.nextInt();
        System.out.println("==============================");

        int[][] array = new int[subsetNumber+1][classNumber + 1];
        int total = 0;

        for (int i = 1; i < array.length; i++) {
            System.out.printf("·请输入第%d个子集各种类的个数：\n", i);
            int temp = 0;
            int total_i = 0;
            for (int j = 1; j < array[0].length; j++) {
                System.out.print("\t类别" + (j) + "的个数: ");
                temp = sc.nextInt();
                total_i += temp;
                array[i][j] = temp;
            }
            array[i][0] = total_i;
            total += total_i;
        }
        array[0][0] = total;

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println(method(array));
    }

    public static double method(int[][] array) {
        double info = 0;
        for (int i = 1; i < array.length; i++) {
            double info_i = 0;
            for (int j = 1; j < array[0].length; j++) {
                double p = (double)array[i][j] / (double)array[i][0];
                if(p==0)
                    break;
                info_i += -p * (Math.log(p) / Math.log(2));
            }
            info += info_i * (double)array[i][0] / (double)array[0][0];
        }
        return info;
    }


}
