package mo.must.day17.test3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<String> ft1 = new FutureTask<>(mc);
        FutureTask<String> ft2 = new FutureTask<>(mc);
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setPriority(5);
        t2.setPriority(10);
        t1.start();
        t2.start();
        System.out.println(ft1.get());
        System.out.println(ft2.get());
    }
}
