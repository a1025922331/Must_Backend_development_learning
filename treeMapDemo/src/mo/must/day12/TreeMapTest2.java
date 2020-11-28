package mo.must.day12;
//给定一个字符串,要求统计字符串中每个字符出现的次数。
//举例: 给定字符串是“aababcabcdabcde”,在控制台输出: “a(5)b(4)c(3)d(2)e(1)”


import java.util.TreeMap;

public class TreeMapTest2 {
    public static void main(String[] args) {
        String s = "asdhakjhfiashd8e576vruftrdtrwnakndkshdjkhgjkhjgfwq";
        TreeMap<Character, Integer> map = new TreeMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                Integer times = map.get(c);
                map.put(c, times+1);
            } else {
                map.put(c,1);
            }
        }

        map.forEach((Character c,Integer times)->System.out.println(c+"---"+times));
    }
}
