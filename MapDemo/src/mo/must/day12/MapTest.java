package mo.must.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Andy",11);
        map.put("Buddy",13);
        map.put("Jesse",12);

        System.out.println(map);

        //遍历方法1：先取keySet,再遍历ketSet集合，用get(key)取出对应的值
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s + "----" + map.get(s));
        }

        System.out.println("====================");

        //遍历方法2：直接取entrySet，再用getKey()和getValue()得到key和value
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }

        System.out.println("====================");

        //遍历方法3：使用forEach(BiConsumer<?super K, ?super V> action)+lambda/匿名内部类
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer age) {
                System.out.println(s + "----" + age);
            }
        });

        System.out.println("====================");

        map.forEach((String s,Integer age)->System.out.println(s + "----" + age));
    }
}
