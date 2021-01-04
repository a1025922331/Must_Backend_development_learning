package mo.must.day13;

import java.io.File;

//listFiles的所有情况
public class FileTest4 {
    public static void main(String[] args) {
        File file1 = new File("fileDemo\\abc.txt");
//        file1.mkdirs();
        File[] files = file1.listFiles();
        System.out.println(files.length);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
