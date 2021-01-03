package mo.must.day13.stream.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        LinkedList<String> sList = new LinkedList<>(List.of("zhangsan,23", "lizi,24", "wangwu,25"));
//        sList.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).forEach(s -> System.out.println(s));
        // 收集成list
        List<String> list = sList.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).collect(Collectors.toList());
        System.out.println(list);
        // 收集成map
        Map<String, Integer> sMap = sList.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap((s -> s.split(",")[0]), (s -> Integer.parseInt(s.split(",")[1]))));
        System.out.println(sMap);
    }


}
