package mo.must.day12;

import java.util.*;

public class ListSetMapTest {
    public static void main(String[] args) {
        //List
        List<String> list =  new LinkedList<>(List.of("a","b","c"));
        System.out.println(list);

        //Set
        Set<String> set =  new HashSet<>(Set.of("a","b","c"));
        System.out.println(set);

        //Map方法1：of(K, V, K, V, K, V, K, V....)(长度有限)
        Map<String,Integer> map1 = new TreeMap<>(Map.of
                ("a",1,"b",2,"c",3));
        System.out.println(map1);

        //Map方法2：ofEntries(Entry... e)(长度不限)
        Map<String,Integer> map2 = new TreeMap<>(Map.ofEntries(
                Map.entry("a",1),
                Map.entry("b",2),
                Map.entry("c",3)));
        System.out.println(map2);
    }
}
