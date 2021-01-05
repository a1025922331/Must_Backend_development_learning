package mo.must.day15.FileReaderWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter(new File("fileReaderWriter\\read.txt"),true);
        FileWriter fw = new FileWriter(new File("fileReaderWriter\\read.txt"));
        //单字符
        fw.write((int) ('c' - 2));
        fw.write('c' - 2);
        //字符数组
        fw.write(new char[]{'a', 'b', 'c'});
        fw.write("abc".toCharArray());
        //字符串
        fw.write("生活就像海洋");

        fw.close();
    }
}
