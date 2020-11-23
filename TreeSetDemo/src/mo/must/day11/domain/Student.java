package mo.must.day11.domain;

public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        int result;
        //先根据年龄进行排序
        result = this.age - o.age;
        //若年龄一致，再根据名字排序
        result = (result == 0) ? this.name.compareTo(o.name) : result;
        return result;
    }

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
