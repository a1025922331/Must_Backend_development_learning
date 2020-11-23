package mo.must.day10;

public class GenericityClassTest {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("充满鲜花的日子");
        System.out.println(box1.getT());

        Box<Integer> box2 = new Box<>(123);
        System.out.println(box2.getT());
    }
}

class Box<T> {
    public T t;

    public Box() {
    }

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
