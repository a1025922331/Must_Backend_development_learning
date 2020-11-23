package mo.must.day10;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("111");
        linkedList.add("222");
        linkedList.add("333");
        //将集合转数组
        String[] array = new String[linkedList.size()];
        array = linkedList.toArray(array);

        System.out.println(Arrays.toString(array));
    }
}
