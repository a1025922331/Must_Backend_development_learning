package mo.must.day17.reentrantLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicketsCallable implements Callable<String> {
    private static int ticketCount = 30;
    private static ReentrantLock rl = new ReentrantLock();

    @Override
    public String call() throws Exception {
        while (true) {
            try {
                rl.lock();
                if (ticketCount <= 0) {
                    break;
                } else {

                    Thread.sleep(100);
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "售出1张票，剩余票数为：" + ticketCount);
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                rl.unlock();
            }
        }
        return "票已售完，" + Thread.currentThread().getName() + "暂停服务！";
    }
}
