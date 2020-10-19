package mo.must.day3.stringTest;
import java.util.Scanner;

public class PhoneNumberSubstring {
    public static void main(StringBuilderTest[] args) {
        String phoneNumber = new Scanner(System.in).nextLine();
        System.out.println(phoneNumber.substring(0,3) + "****" + phoneNumber.substring(7));
    }
}
