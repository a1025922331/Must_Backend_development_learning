package mo.must.day17.syschronized;

public class SynchronizedTest2 {
    public static void main(String[] args) {
        SellTicketsRunnable str = new SellTicketsRunnable();

        Thread t1 = new Thread(str,"窗口1");
        Thread t2 = new Thread(str,"窗口2");
        Thread t3 = new Thread(str,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
