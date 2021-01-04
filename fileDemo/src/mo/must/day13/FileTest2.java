package mo.must.day13;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("abcd");
        if(!file1.exists()){
            file1.mkdirs();
        }
        File file2 = new File(file1,"abc.txt");
        file2.createNewFile();
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getAbsolutePath());
    }
}
