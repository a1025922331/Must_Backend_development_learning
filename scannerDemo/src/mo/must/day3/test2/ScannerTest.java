package mo.must.day3.test2;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("=======================");
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(a);
        System.out.println(s);
    }
}
