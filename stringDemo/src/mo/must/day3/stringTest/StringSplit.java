package mo.must.day3.stringTest;
import java.util.Scanner;
import java.lang.Integer;

public class StringSplit {
    public static void main(String[] args) {
        String infoOfStudent = new Scanner(System.in).nextLine();
        //先去空格再切割
        String[] standareInfo = infoOfStudent.replace(" ","").split(",");
        Student student = new Student(standareInfo[0],Integer.valueOf(standareInfo[1]));
        System.out.println(student);
    }
}
