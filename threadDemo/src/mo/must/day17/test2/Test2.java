package mo.must.day17.test2;

public class Test2 {
    public static void main(String[] args){
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"操作1");
        Thread t2 = new Thread(mr,"操作2");

        t1.start();
        t2.start();
    }
}
