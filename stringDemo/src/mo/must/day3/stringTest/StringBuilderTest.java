package mo.must.day3.stringTest;

import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;


public class StringBuilderTest {
    public static void main(String[] args) {
        //方法一：利用StringBuilder的reverse方法进行翻转
        System.out.println("===================================");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            //用StringBuilder的reverse()进行翻转
            if (i + 1 == Integer.valueOf(new StringBuilder("" + (i + 1)).reverse().toString())) {
                System.out.println(i + 1);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("===================================");
        System.out.println("共用时： " + (end - start) + "ms");
        System.out.println("===================================");

        //方法二：利用String.toCharArray（）
        char[] cArray;
        boolean flag = false;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            flag = true;
            cArray = String.valueOf(i + 1).toCharArray();
            for (int j = 0, k = cArray.length - 1; j < k; j++, k--) {
                if (cArray[j] != cArray[k])
                    flag = false;
            }
            if (flag)
                System.out.println(i + 1);
        }
        end = System.currentTimeMillis();
        System.out.println("共用时： " + (end - start) + "ms");

    }
}
