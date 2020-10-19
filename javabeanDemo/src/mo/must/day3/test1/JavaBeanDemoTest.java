package mo.must.day3.test1;

public class JavaBeanDemoTest {
    public static void main(String[] args) {
        JavaBeanDemo javabean_a = new JavaBeanDemo();
        JavaBeanDemo javabean_b = new JavaBeanDemo(1, 2);
        System.out.println(javabean_a);
        System.out.println(javabean_b);
    }
}
