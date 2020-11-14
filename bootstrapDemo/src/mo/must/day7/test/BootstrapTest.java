package mo.must.day7.test;
import java.util.Random;

//自助法抽样
public class BootstrapTest {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10000000];
        int length = array.length;
        int selectNum = 0;
        for (int i = 0; i < length; i++) {
            array[rd.nextInt(length)] = 1;
        }
        for (int i = 0; i < length; i++) {
            selectNum += array[i];
        }
        System.out.println((double)selectNum/length);
    }
}
