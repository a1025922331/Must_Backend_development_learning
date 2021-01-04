package mo.must.day13;

import java.io.File;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        //统计一个文件夹中,每种文件出现的次数.
        // 统计 ‐‐‐ 定义一个变量用来统计. ‐‐‐‐ 弊端:同时只能统计一种文件
        // 利用map集合进行数据统计,键 ‐‐‐ 文件后缀名 值 ‐‐‐‐ 次数

        File file = new File("C:\\Users\\a1025\\Desktop\\1231");

        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm, file); System.out.println(hm); }
        //1.定义一个方法,参数是HashMap集合用来统计次数和File对象要统计的文件夹
        private static void getCount(HashMap<String, Integer> hm, File file) {
        //2.遍历File对象,获取它下边的每一个文件和文件夹对象
        File[] files = file.listFiles();
        for (File f : files) {
            //3.判断当前File对象是文件还是文件夹
        if(f.isFile()){
            //如果是文件,判断这种类型文件后缀名在HashMap集合中是否出现过
            String fileName = f.getName();
            String[] fileNameArr = fileName.split("\\.");
            if(fileNameArr.length == 2){ String fileEndName = fileNameArr[1];
            if(hm.containsKey(fileEndName)){
                //出现过,获取这种类型文件的后缀名出现的次数,对其+1,在存回集合中
                Integer count = hm.get(fileEndName); //这种文件又出现了一次.
                count++; //把已经出现的次数给覆盖掉.
                hm.put(fileEndName,count);
            }else{// 没出现过,将这种类型文件的后缀名存入集合中,次数存1
                hm.put(fileEndName,1); } }
        }else{ //如果是文件夹,递归调用自己,HashMap集合就是参数集合,File对象是当前文件夹对象代码实现
            getCount(hm,f); } } }
        }
