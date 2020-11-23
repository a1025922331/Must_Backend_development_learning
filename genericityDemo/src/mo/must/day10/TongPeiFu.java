package mo.must.day10;

import java.util.ArrayList;
import java.util.Arrays;

public class TongPeiFu {
    public static void main(String[] args) {
        ArrayList<String> sArrayList = new ArrayList<>();
        sArrayList.add("a");
        ArrayList<Integer> iArrayList = new ArrayList<>();
        iArrayList.add(1);

        method1(sArrayList);
        method1(iArrayList);
        method2(sArrayList);
        method2(iArrayList);
    }

    //使用常规方法
    public static <T> void method1(ArrayList<T> array){
        System.out.println(array.toString());
    }
    //使用类型通配符
    public static void method2(ArrayList<?> array){
        System.out.println(array.toString());
    }
}
