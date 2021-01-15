package mo.must.day17.syschronized;

public class SellTicketsRunnable implements Runnable{
    private static int ticketCount = 30;

    @Override
    public void run() {
//        synchronizedMethod();//同步方法，锁对象为this
        staticSynchronizedMethod();//静态同步方法，锁对象当前类的字节码文件对象(Class.class)

    }

    //同步方法的锁对象是this
    private synchronized void synchronizedMethod() {
        while (true) {
            if (ticketCount <= 0) {
                System.out.println("票卖完了");
                break;
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticketCount--;
                System.out.println(Thread.currentThread().getName() + "售出1张票，剩余票数为：" + ticketCount);
            }
        }
    }

    //静态同步方法的锁对象是当前类.class(即字节码文件的对象)
    private static synchronized void staticSynchronizedMethod() {
        while (true) {
            if (ticketCount <= 0) {
                System.out.println("票卖完了");
                break;
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticketCount--;
                System.out.println(Thread.currentThread().getName() + "售出1张票，剩余票数为：" + ticketCount);
            }
        }
    }
}
