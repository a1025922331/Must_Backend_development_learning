package mo.must.day10;

import java.util.LinkedList;

public class GenericityMethod {
    public static void main(String[] args) {
        LinkedList<String> stringList = combineList(new LinkedList<String>(),
                "a", "b", "c", "d");
        System.out.println(stringList);
    }

    public static <T> LinkedList<T> combineList(LinkedList<T> linkedList, T t1, T t2, T t3, T t4) {
        linkedList.add(t1);
        linkedList.add(t2);
        linkedList.add(t3);
        linkedList.add(t4);
        return linkedList;
    }
}
