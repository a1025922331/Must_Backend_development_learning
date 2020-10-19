package mo.must.day3.stringTest;
import java.util.Scanner;

public class CombineString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArray = new char[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个字符: ");
            cArray[i] = sc.nextLine().charAt(0);
        }
        System.out.println(combine(cArray));
    }

    //传入字符数组，返回一个合并后的字符组(像python中的列表形式一样)
    //关键在于使用了StringBuilder中的append()方法，
    //避免了使用String的“+”操作时创建过多的不必要的StringBuilder对象和String对象
    public static String combine(char[] cArray) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < cArray.length; i++) {
            if (i == cArray.length - 1)
                sb.append(cArray[i] + "]");
            else
                sb.append(cArray[i] + ", ");
        }
        return sb.toString();
    }
}
