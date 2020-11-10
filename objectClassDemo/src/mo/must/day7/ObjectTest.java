package mo.must.day7;

public class ObjectTest {
    public static void main(String[] args) {
        String a = "string";
        StringBuilder b = new StringBuilder("String");
        //1
        System.out.println(a.equals(b));
        //2
        System.out.println(b.equals(a));
    }
}
