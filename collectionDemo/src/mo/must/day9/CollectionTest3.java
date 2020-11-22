package mo.must.day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest3 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Student stu = new Student("张三",23);
        collection.add(stu);
        collection.add(new Student("李四",24));
        collection.add(new Student());

        Iterator<Student> it = collection.iterator();
        while(it.hasNext()){
            Student stu1 = it.next();
            System.out.println(stu1.getName());
        }
        collection.remove(stu);
        System.out.println(collection);

    }
}
