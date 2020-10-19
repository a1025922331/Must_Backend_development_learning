package mo.must.day3.stringTest;
import org.w3c.dom.ls.LSOutput;

import java.lang.String;

public class StringTest {

    public static void main(String[] args) {
        char char_array[] = {'a','b','c'};
        String a = new String( char_array);   //堆内存中
        String b = a;
        String c = new String(a);

        // ↑ b，c的区别在哪里
        System.out.println("Are a and b have the same address? " + a == b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
