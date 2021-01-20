package mo.must.day19.ExecutorService;

import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) {
        //创建线程池
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(1,
                2,
                5,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());

        //提交任务
        for (int i = 0; i < 100; i++) {
            final int temp = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(temp + Thread.currentThread().getName() + "正在执行");
                }
            });
        }

        //关闭线程池
        executorService.shutdown();
    }
}
