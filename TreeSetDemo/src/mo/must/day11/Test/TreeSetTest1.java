package mo.must.day11.Test;
//使用自然排序方式进行TreeSet排序
import mo.must.day11.domain.Student;
import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
        //无参构造
        TreeSet<Student> treeSet = new TreeSet<>();
        Student stu1 = new Student("apple",22);
        Student stu2 = new Student("banana",22);
        Student stu3 = new Student("zero",31);
        Student stu4 = new Student("confidence",31);

        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);

        System.out.println(treeSet.toString());
    }
}
