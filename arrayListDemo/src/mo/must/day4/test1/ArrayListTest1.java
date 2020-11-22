package mo.must.day4.test1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");
        //将集合转数组
        String[] array = new String[arrayList.size()];
        array = arrayList.toArray(array);

        System.out.println(Arrays.toString(array));
    }
}
