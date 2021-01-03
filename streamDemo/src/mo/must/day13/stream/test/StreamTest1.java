package mo.must.day13.stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // 匿名内部类
        list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // lambda表达式
        list.stream().filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.println(integer));
    }
}
