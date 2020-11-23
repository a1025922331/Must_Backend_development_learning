package mo.must.day11.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
        //不按照自然排序方式，则需要选择比较器排序
        TreeSet<String> treeSet = new TreeSet<>((s1, s2) -> {
            int result;
            result = s1.length() - s2.length();
            result = (result == 0) ? s1.compareTo(s2) : result;
            return result;
        });
        treeSet.add("c");
        treeSet.add("ab");
        treeSet.add("df");
        treeSet.add("quiet");

        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
