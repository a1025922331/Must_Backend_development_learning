package mo.must.day17.syschronized;

public class SellTicketsThread extends Thread {
    //票数
    private static int ticketCount = 100;
    private static Object object = new Object(); //锁对象保证唯一性

    //构造方法
    public SellTicketsThread() {
    }

    public SellTicketsThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized(object){
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
                    System.out.println(getName() + "售出1张票，剩余票数为：" + ticketCount);
                }
            }
        }
    }
}
