package mo.must.day17.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

//与ID流交结合的方法
public class PropertiesTest3 {

    public static void main(String[] args) throws IOException {
        //输出/存储properties表：store
        writerProperties();
        //读取/加载properties表：load
        propertiesReader();
    }

    private static void propertiesReader() throws IOException {
        Properties pps = new Properties();
        //读取应与写入一致，选择字符流
        FileReader fr = new FileReader("propertiesDemo\\system.properties");
        pps.load(fr);
        fr.close();
        //遍历1
        pps.list(System.out);
        System.out.println("=========================================================");
        //遍历2
        Set<String> set = pps.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + "=" + pps.getProperty(s));
        }
    }


    //写properties表
    private static void writerProperties() throws IOException {
        //将系统的properties读取进来
        Properties pps = System.getProperties();
        //选择使用字符流
//        pps.list(System.out);
        FileWriter fw = new FileWriter("propertiesDemo\\system.properties", false);
        pps.store(fw, "We are comments!!!"); //comments可以null或""
        fw.close();
    }

    //读properties表
}
