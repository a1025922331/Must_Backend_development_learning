package mo.must.day3.stringTest;

public class BianLiString {
    public static void main(StringBuilderTest[] args) {
        //初始化
        String s = "GUOZE XIN";
        char c;

        //遍历方法1
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            System.out.println(c);
        }

        //遍历方法2
        char[] cArray = s.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            System.out.println(cArray[i]);
        }
    }
}
