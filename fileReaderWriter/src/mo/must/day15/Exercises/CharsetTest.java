package mo.must.day15.Exercises;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class CharsetTest {
    public static void main(String[] args) throws IOException {
        //以GBK字符编码格式写出
        FileOutputStream fos = new FileOutputStream("fileReaderWriter\\charsetTest.txt");
        fos.write("生活就像海洋".getBytes("GBK"));
        fos.close();

        //默认字符编码格式读入
        FileReader fr = new FileReader("fileReaderWriter\\charsetTest.txt");
        int c;
        while((c=fr.read())!=-1){
            System.out.print((char) c);
        }
        fr.close();

        System.out.print("\r\n");

        //指定GBK编码格式读入
        FileReader fr2 = new FileReader("fileReaderWriter\\charsetTest.txt", Charset.forName("GBK"));
        int c2;
        while((c2=fr2.read())!=-1){
            System.out.print((char) c2);
        }
        fr2.close();
    }
}
