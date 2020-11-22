package mo.must.day9;

public class Student {
    String name;
    int age;
    static{
        System.out.println("我是静态代码块");
    }
    {
        System.out.println("我是构造代码块");
    }
    public Student(){
        this("default",1);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
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
