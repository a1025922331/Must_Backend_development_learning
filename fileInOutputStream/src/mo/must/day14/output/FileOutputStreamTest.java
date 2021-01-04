package mo.must.day14.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("fileInOutputStream\\abc.txt");
        FileOutputStream fos = new FileOutputStream("fileInOutputStream\\abc.txt",true);

        fos.write("\r\n".getBytes());
        fos.write("abc".getBytes());

        fos.close();
    }
}
