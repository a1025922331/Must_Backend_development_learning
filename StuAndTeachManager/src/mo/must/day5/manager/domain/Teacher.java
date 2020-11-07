package mo.must.day5.manager.domain;

public class Teacher {
    //成员变量
    private String id;
    private String name;
    private int age;
    private String birthday;

    //成员方法
    public Teacher() {
    }

    public Teacher(String teacherId, String name, int age, String birthday) {
        this.id = teacherId;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
