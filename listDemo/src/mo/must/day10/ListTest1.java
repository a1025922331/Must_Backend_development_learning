package mo.must.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add(0,"bbb");
        arrayList.add(0,"ccc");
        arrayList.add(0,"ddd");
        arrayList.add(0,"eee");

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        arrayList.remove("aaa");
        System.out.println(arrayList);
        arrayList.set(0,"zzz");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
    

}
