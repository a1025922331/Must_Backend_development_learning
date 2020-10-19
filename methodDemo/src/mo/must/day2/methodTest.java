package mo.must.day2;
import java.util.Random;

//求数组最大最小值方法

public class methodTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        int[] result = getMaxAndMin(array);
        System.out.println();
        System.out.println("max is: "+ result[0]);
        System.out.println("min is: "+ result[1]);
//        System.out.println(true || false);

    }

    public static int[] getMaxAndMin(int[] a) {
        int max = a[0];
        int min = a[0];
        int[] result = new int[2];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];
        }
        result[0] = max;
        result[1] = min;
        return result;
    }

}
