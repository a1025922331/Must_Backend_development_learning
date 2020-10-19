package mo.must.day2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone a =  new Phone();
        a.brand = "apple";
        a.price = 5499;
        a.call("乔布斯");
        System.out.println(a);
    }

}
