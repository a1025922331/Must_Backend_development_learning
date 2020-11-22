package mo.must.day9;
import java.util.Random;

import java.util.ArrayList;

public class CollectionTest2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("123");
        array.add("456");
        System.out.println(array.toString());

        Integer a = 1;
        Random rd = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(rd);
        System.out.println(sb);
    }

}
