package mo.must.day19.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        //创建默认线程池
        ExecutorService executorService1 = Executors.newCachedThreadPool();
//        ExecutorService executorService2 = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 1000; i++) {
            final int temp = i;
            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行! " + temp);
                }
            });
        }

        executorService1.shutdown();
    }
}
