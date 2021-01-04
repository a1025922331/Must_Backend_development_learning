package mo.must.day14.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fileInOutputStream\\abc.txt");
        int c;
        while((c = fis.read())!=-1)
            System.out.print((char) c);
        fis.close();
    }
}
