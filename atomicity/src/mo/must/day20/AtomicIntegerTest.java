package mo.must.day20;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        //保证了修改共享变量操作的原子性
                        int temp = Ticket.count.incrementAndGet();
//                        int temp = ++Ticket.count;
                        System.out.println(Thread.currentThread().getName() + "卖出了第" + temp + "张票");
                    }
                }
            }).start();
        }
    }
}

class Ticket {
    //保证了修改共享变量操作的原子性
    public static AtomicInteger count = new AtomicInteger(0);
//    public static int count = 0;
}
