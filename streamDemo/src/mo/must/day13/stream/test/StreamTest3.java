package mo.must.day13.stream.test;
import mo.must.day13.stream.domain.Actor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("111", "222", "333", "44"));
        ArrayList<String> list2 = new ArrayList<>(List.of("551", "552", "334"));

        Stream.concat(list1.stream().filter(s -> s.length()==3).limit(2),
                    list2.stream().filter(s -> s.startsWith("5")).skip(1))
                    .forEach(s -> System.out.println(new Actor(s)));
    }
}
