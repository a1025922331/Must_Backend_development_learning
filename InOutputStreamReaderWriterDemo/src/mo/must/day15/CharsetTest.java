package mo.must.day15;

import java.io.*;

//转换流
public class CharsetTest {
    public static void main(String[] args) throws IOException {
        //先写
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("InOutputStreamReaderWriterDemo\\GBK.txt"),"GBK");
        osw.write("今天是个好日子呀！".toCharArray());
        osw.close();
        //再读
        InputStreamReader isr = new InputStreamReader(new FileInputStream("InOutputStreamReaderWriterDemo\\GBK.txt"),"GBK");
        int c;
        while((c = isr.read())!=-1){
            System.out.print((char)c);
        }
        isr.close();
    }
}
