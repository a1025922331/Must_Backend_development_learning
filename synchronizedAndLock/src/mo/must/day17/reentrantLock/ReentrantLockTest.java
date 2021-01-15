package mo.must.day17.reentrantLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SellTicketsCallable stc = new SellTicketsCallable();

        FutureTask<String> ft1 = new FutureTask<>(stc);
        FutureTask<String> ft2 = new FutureTask<>(stc);
        FutureTask<String> ft3 = new FutureTask<>(stc);

        Thread t1 = new Thread(ft1,"窗口1");
        Thread t2 = new Thread(ft2,"窗口2");
        Thread t3 = new Thread(ft3,"窗口3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println(ft1.get());
        System.out.println(ft2.get());
        System.out.println(ft3.get());
    }
}
