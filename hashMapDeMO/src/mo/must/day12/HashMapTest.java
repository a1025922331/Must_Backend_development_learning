package mo.must.day12;

import mo.must.day12.domain.Student;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<>();
        map.put(new Student("gzx",22),99);
        map.put(new Student("gzj",24),100);

        map.forEach((Student stu,Integer score)->System.out.println(stu.getName() + "的成绩为" + score));
        ;
    }
}
