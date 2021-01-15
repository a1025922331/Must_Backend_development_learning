package mo.must.day19.ThreadPoolExecutor;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                                                                       2,
                                                                       20,
                                                                        TimeUnit.SECONDS,
                                                                        new ArrayBlockingQueue(4),
                                                                        Executors.defaultThreadFactory(),
                                                                        new ThreadPoolExecutor.AbortPolicy());
//                                                                        new ThreadPoolExecutor.DiscardPolicy());
//                                                                        new ThreadPoolExecutor.DiscardOldestPolicy());
//                                                                        new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 1; i <= 10; i++) {
            final int x = i; //使用最终变量来完成内部类对本地变量的间接引用
            try {
                threadPoolExecutor.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(100); //等待一会，保证线程不至于那么快运行完
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"线程正在执行任务" + x);
                    }
                });
            } catch (RejectedExecutionException e) {
                System.out.println("捕获到RejectedExecutionException异常：任务"+ i + "被线程池拒绝了！");
            }
        }
        //关闭线程池
        threadPoolExecutor.shutdown();
    }
}



