package mo.must.day12;

import mo.must.day12.domain.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student,Integer> map = new TreeMap<>();
        map.put(new Student("gzx",22),99);
        map.put(new Student("gzj",24),100);
        map.put(new Student("gzz",22),100);

        Set<Map.Entry<Student, Integer>> entries = map.entrySet();
        for (Map.Entry<Student, Integer> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        System.out.println("===========");

        TreeMap<Student,Integer> map1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result;
                result = o1.getAge() - o2.getAge();
                result = (result == 0) ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        map1.put(new Student("gzx",22),99);
        map1.put(new Student("gzj",24),100);
        map1.put(new Student("gzz",22),100);

        map1.forEach(new BiConsumer<Student, Integer>() {
            @Override
            public void accept(Student student, Integer integer) {
                System.out.println(student + "---" + integer);
            }
        });
    }
}
