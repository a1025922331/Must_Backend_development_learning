package mo.must.day10;

public class GenericityInterface {
    public static void main(String[] args) {
        //实现方式1
        A_1<String> s = new A_1<>();
        s.method("abc");
        //实现方式2
        A_2 i = new A_2();
        i.method(123);
    }

}

//泛型接口
interface A<T>{
    public void method(T t);
}

//泛型接口实现方式1：
class A_1<T> implements A<T>{
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}

//泛型接口实现方式2：
class A_2 implements A<Integer>{
    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}

