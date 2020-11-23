package mo.must.day11.Test;

import mo.must.day11.domain.Teacher;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //使用带参构造方法，用匿名内部类传入比较器
        TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result;
                result = o1.getAge() - o2.getAge();
                result = (result == 0) ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        //使用带参构造方法，用lambda表达式传入比较器
        TreeSet<Teacher> treeSet2 = new TreeSet<>((o1, o2) -> {
            int result;
            result = o1.getAge() - o2.getAge();
            result = (result == 0) ? o1.getName().compareTo(o2.getName()) : result;
            return result;
        });

        Teacher tea1 = new Teacher("apple", 22);
        Teacher tea2 = new Teacher("banana", 22);
        Teacher tea3 = new Teacher("zero", 31);
        Teacher tea4 = new Teacher("confidence", 31);

        treeSet.add(tea1);
        treeSet.add(tea2);
        treeSet.add(tea3);
        treeSet.add(tea4);
        treeSet2.add(tea1);
        treeSet2.add(tea2);
        treeSet2.add(tea3);
        treeSet2.add(tea4);

        //迭代器访问
        Iterator<Teacher> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("====");
        //迭代器访问
        Iterator<Teacher> it2 = treeSet2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
