package mo.must.day13;

import java.io.File;
import java.util.*;

public class FileTest5 {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\a1025\\Desktop\\1231");
        File file = new File("C:\\Users\\a1025\\IdeaProjects\\Must_Backend_development_learning");
        HashMap<String, Integer> hm = new HashMap<>();
        if (file.isDirectory()) {
            countFilesType(hm, file);
        }
        else
            System.out.println("不存在该文件夹");
        //遍历方式1
        Set<String> keySet = hm.keySet();
        for (String s : keySet) {

            System.out.println(s + "类型文件有" + hm.get(s) +"个");
        }
        hm.forEach((String s,Integer i)-> System.out.println(s + i));
    }

    private static void countFilesType(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File file_ : files) {
            // 文件
            if (file_.isFile()) {
//                System.out.println(file_.getName().split("."));
                String[] fileString = file_.getName().split("\\.");
                System.out.println(Arrays.toString(fileString));
                if (fileString.length == 2) {
                    if (hm.containsKey(fileString[1])) {
                        hm.put(fileString[1], hm.get(fileString[1]) + 1);
//                        System.out.println(fileString[1] + ":" + hm.get(fileString[1]));
                    } else {//如果不存在该类型
                        hm.put(fileString[1], 1);
//                        System.out.println(fileString[1] + ":" + hm.get(fileString[1]));
                    }
                }
            }
            // 文件夹
            else {
                countFilesType(hm, file_);
            }
        }
    }
}
