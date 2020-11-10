package mo.must.day7.test;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] array1 = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array1));

        //方法1：clone()方法
        int[] array2 = array1.clone();
        System.out.println(Arrays.toString(array2));

        //方法2：System.arraycopy(原数组，开始位置，目的数组，开始位置，拷贝个数)
        int[] array3 = new int[array1.length];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.out.println(Arrays.toString(array3));

        //方法3：Arrays.copyOf(原数组，拷贝个数)
        int[] array4 = Arrays.copyOf(array1,array1.length);
        System.out.println(Arrays.toString(array4));

        //方法4：Arrays.copyRange(原数组，开始位置，拷贝个数)
        int[] array5 = Arrays.copyOfRange(array1,0,array1.length);
        System.out.println(Arrays.toString(array5));
    }
}
