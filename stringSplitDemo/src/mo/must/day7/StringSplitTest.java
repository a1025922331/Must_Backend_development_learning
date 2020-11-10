package mo.must.day7;

import java.util.Arrays;

public class StringSplitTest {
    public static void main(String[] args) {
        int[] iArray = stringSplit("13 15 19 03 23 01 76");
        for (int i = 0; i < iArray.length; i++) {
            System.out.println(iArray[i]);
        }
    }

    public static int[] stringSplit(String s){
        String[] sArray = s.split(" ");
        int[] iArray = new int[sArray.length];

        for (int i = 0; i < sArray.length; i++) {
            iArray[i] = Integer.valueOf(sArray[i]);
        }

        Arrays.sort(iArray);

        return iArray;

    }
}
