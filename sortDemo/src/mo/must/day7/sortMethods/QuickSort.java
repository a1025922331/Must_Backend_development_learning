package mo.must.day7.sortMethods;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high)
            return;

        //备份头尾索引
        int lowCopy = low;
        int highCopy = high;
        //设置基准线
        int baseNum = array[low];
        //定义临时变量
        int temp;

        //partition
        while (low != high) {
            //从右往左找小于base number的
            while (low != high && array[high] >= baseNum) {
                high--;
            }
            //从左往右找大于base number的
            while (low != high && array[low] <= baseNum) {
                low++;
            }
            //左右交换
            temp = array[low];
            array[low] = array[high];
            array[high] = temp;
        }
        //base number归位
        temp = array[low];
        array[low] = array[lowCopy];
        array[lowCopy] = temp;

        //baseNum左边递归快排，右边递归快排
        quickSort(array,lowCopy, low - 1);
        quickSort(array, low + 1, highCopy);
    }
}
