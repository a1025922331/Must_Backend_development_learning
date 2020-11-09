package mo.must.day7.test1;

//匿名内部类测试

public class InnerClassTest1 {
    public static void main(String[] args) {
        getTeacher(new SchoolInterface() {
            @Override
            public String addTeacher() {
                return "Tommy";
            }
        });
    }
    public static void getTeacher(SchoolInterface school){
        System.out.println(school.addTeacher());
    }
}

interface SchoolInterface{
    public String addTeacher();
}