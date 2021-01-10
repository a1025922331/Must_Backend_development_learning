package mo.must.day17.test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

//普通方法
public class PropertiesTest1 {
    public static void main(String[] args){
        Properties pps = new Properties();
        pps.put("properties1","value1");
        pps.put("properties2","value2");
        pps.put("properties3","value3");
        pps.remove("properties2");
        Set<Map.Entry<Object, Object>> entries = pps.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
