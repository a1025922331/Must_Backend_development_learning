package mo.must.day15.FileReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fd = new FileReader(new File("fileReaderWriter\\read.txt"));
        //按utf-8的编码格式读取
        char[] temps = new char[1024];
        int len = 0;
        while ((len = fd.read(temps)) != -1) {
//            System.out.print(Arrays.copyOf(temps,len));
            System.out.print(new String(temps,0,len));
//            System.out.print(new String(temps).substring(0,len));
        }
        fd.close();
    }
}
