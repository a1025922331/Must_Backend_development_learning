package mo.must.day13;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

// 统计所有文件类型的个数
public class FileTest6 {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\a1025\\IdeaProjects\\Must_Backend_development_learning");
        File file = new File("C:\\Users\\a1025\\Desktop");
        HashMap<String, Integer> hm = new HashMap<>();
        if (file.isDirectory()) {
            countFileSTypes(hm, file);
        } else {
            System.out.println("this path is not a directory path! Please check it again.");
        }
//        //遍历方式1:keySet
//        System.out.println("遍历方式1:keySet");
//        Set<String> keySet = hm.keySet();
//        for (String k : keySet) {
//            System.out.println(k + " : " + hm.get(k));
//        }

//        //遍历方式2：使用entrySet
//        System.out.println("遍历方式2:entrySet");
//        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
//        for (Map.Entry<String, Integer> entry : entrySet) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        //遍历方式3：使用forEach
        System.out.println("遍历方式3:forEach");
        hm.forEach((String s, Integer i) -> System.out.println(s + " : " + i)); //lambda
//        hm.forEach(new BiConsumer<String, Integer>() { //匿名内部类
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + " : " + integer);
//            }
//        });
    }

    private static void countFileSTypes(HashMap<String, Integer> hm, File file) {
        // 先读取子目录得到File数组
        File[] files = file.listFiles();
        // 遍历File数组，分情况处理
        for (File f : files) {
            //如果是文件
            if (f.isFile()) {
                String[] ss = f.getName().split("\\.");//此处需要加上转移字符，至于为什么是\\而不是\等之后再深究
                //截取后缀名
                if (ss.length == 2) {
                    String postfix = ss[1];
                    //是否已经存在该类型
                    if (hm.containsKey(postfix)) {
                        hm.put(postfix, hm.get(postfix) + 1);
                    } else {
                        hm.put(postfix, 1);
                    }
                }
            } else {//如果是文件夹
                countFileSTypes(hm, f);
            }
        }
    }
}
