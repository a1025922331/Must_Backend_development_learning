package mo.must.day17.test;

import java.util.Properties;
import java.util.Set;

//作为map的特有方法
public class PropertiesTest2 {
    public static void main(String[] args) {
        Properties pps = new Properties();
        pps.setProperty("property1","value1");
        pps.setProperty("property2","value2");
        pps.setProperty("property3","value3");

        Set<String>  ss = pps.stringPropertyNames();
        for (String s : ss) {
            System.out.println(s + "=" + pps.getProperty(s));
        }
    }
}
