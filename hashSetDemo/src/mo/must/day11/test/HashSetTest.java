package mo.must.day11.test;

import mo.must.day11.domain.Student;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student stu1 = new Student("a", 25);
        Student stu2 = new Student("a", 25);
        Student stu3 = new Student("b", 25);
        Student stu4 = new Student("b", 31);

        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);
        hashSet.add(stu4);

        for (Student student : hashSet) {
            System.out.println(student);
        }
    }
}
