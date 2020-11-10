package mo.must.day7.sortMethods;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7,1,2,3,4,5,6};
        int[] b = {7,1,2,3,4,5,6};

        long start = System.currentTimeMillis();

        //not use flag variable
        bubbleSortNotUueFlag(a);
        long point1 = System.currentTimeMillis();

        //use flag variable
        bubbleSort(b);
        long point2 = System.currentTimeMillis();

        System.out.println(Arrays.toString(a));
        System.out.println(point1 - start);
        System.out.println(Arrays.toString(b));
        System.out.println(point2 - point1);

    }

    public static void bubbleSortNotUueFlag(int[] array) {
        //from small to big
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //用了flag优化
    public static void bubbleSort(int[] array) {
        //from small to big
        int temp;
        //Is there an exchange going on？
        boolean flag;

        for (int i = 0; i < array.length - 1; i++) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }
        return;
    }
}
