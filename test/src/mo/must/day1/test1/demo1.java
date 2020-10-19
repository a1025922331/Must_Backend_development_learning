package mo.must.day1.test1;
import java.util.Scanner;
import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList a = new ArrayList();
        a.add(sc.nextInt());
        System.out.println(a.get(0).getClass());
    }
}
