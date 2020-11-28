package mo.must.day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("bb");
        arrayList.add("ccc");
        arrayList.add("dddd");
        arrayList.add("eeeee");

        //迭代器实现循环
        Iterator<String> it = arrayList.iterator();//初始化指向第一个元素前的空位置
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s.length());
        }

        //迭代器实现删除
        it = arrayList.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.length()>3){
                it.remove(); //先用next再用remove
            }
        }

        //增强for循环（其内部原理是一个iterator迭代器）
        for(String s : arrayList){
            System.out.println(s.length());
        }
    }
}
