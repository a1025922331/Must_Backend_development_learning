package mo.must.day3.test1;

public class JavaBeanDemo {
    //成员变量
    private int a;
    private int b;

    //构造方法
    public JavaBeanDemo() {
    }

    public JavaBeanDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //set & get方法
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "JavaBeanDemo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
