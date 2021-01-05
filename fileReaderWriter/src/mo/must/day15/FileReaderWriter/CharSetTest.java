package mo.must.day15.FileReaderWriter;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "生活就像海洋，只有意志坚强的人才能到达彼岸";
        //字符编码
        byte[] cArrayUtf8 = s.getBytes();
        byte[] cArrayGbk = s.getBytes("GBK");
        //查看字节数组
        System.out.println(Arrays.toString(cArrayUtf8));
        System.out.println(Arrays.toString(cArrayGbk));
        //字符解码
        System.out.println(new String(cArrayUtf8));
        System.out.println(new String(cArrayGbk,"gbk"));
    }
}
