package mo.must.day6.test2;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {

        //匿名内部类：编译期间会自动生成一个独立的实现类或者继承类的字节码文件
        getMethod(new Inter() {
            @Override
            public void method(String s) {
                System.out.println(s);
            }
        });

        //Lambda表达式：编译期间不会生成一个独立的字节码文件，对应的字节码文件会在运行时动态生成
        //getMethod((s)-> System.out.println(s));
    }

    public static void getMethod(Inter inter){
        inter.method("匿名内部类");
    }
}
//接口
interface Inter{
    public abstract void method(String s);
}