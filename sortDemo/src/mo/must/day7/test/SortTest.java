package mo.must.day7.test;

import java.util.Arrays;
import java.util.Random;

import mo.must.day7.sortMethods.QuickSort;
import mo.must.day7.sortMethods.BubbleSort;

public class SortTest {
    public static void main(String[] args) {

        //准备
        Random rd = new Random();

        //生成数组
        int[] array1 = new int[10000];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rd.nextInt(10000);
        }
        int[] array2 = array1.clone();

        //数组预览
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        //时间
        long begin = System.currentTimeMillis();

        //array1采用bubble sort
        BubbleSort.bubbleSort(array1);
        long timePoint1 = System.currentTimeMillis();

        //array2采用quick sort
        QuickSort.quickSort(array2, 0, array2.length - 1);
        long timePoint2 = System.currentTimeMillis();

        System.out.println("冒泡排序时间：" + (timePoint1 - begin) + "ms");
        System.out.println(Arrays.toString(array1));
        System.out.println("快速排序时间：" + (timePoint2 - timePoint1) + "ms");
        System.out.println(Arrays.toString(array2));

    }


}
