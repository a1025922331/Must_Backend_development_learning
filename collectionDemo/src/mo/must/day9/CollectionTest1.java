package mo.must.day9;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("bb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("eeeee");
        collection.add("ffffff");

        //匿名内部类的形式
        collection.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 3;
            }
        });
        System.out.println(collection);

        //lambda表达式的形式:(函数式编程，抛开形式，着重于要做什么)
        collection.removeIf((String s) -> s.length() > 2);
        System.out.println(collection);

        collection.clear();
        System.out.println(collection);


    }
}