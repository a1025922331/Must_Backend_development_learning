package mo.must.day13;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("fileDemo\\abc.txt");
//        file1.createNewFile();
//        file1.mkdirs();
//        file1.delete();
//        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.isDirectory());

        File file2 = new File("C:\\Users\\a1025\\IdeaProjects\\Must_Backend_development_learning");
        File[] files = file2.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
