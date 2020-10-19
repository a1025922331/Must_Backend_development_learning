package mo.must.day3.stringTest;
import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String s1 = s.replace("他妈的","***");
        String s2 = s.replace("他妈的","");
        System.out.println(s1);
        System.out.println(s2);
    }
}
