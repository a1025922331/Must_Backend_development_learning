package mo.must.day17.deadlock;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLockTest {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        //匿名内部类
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o1) {
                        synchronized (o2) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread().getName() + "在鹊桥上走");
                        }
                    }
                }

            }
        }, "牛郎");


        //lambda表达式
        Thread t2 = new Thread(() -> {
            synchronized (o2) {
                synchronized (o1) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "在鹊桥上走");
                }
            }
        }, "织女");

        t1.start();
        t2.start();
    }
}
