package mo.must.day17.DaemonThreadTest;

public class DaemonThreadTest {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("User Thread 1");
        MyThread mt2 = new MyThread("User Thread 2");
        MyThread2 mt3 = new MyThread2("Daemon Thread 1");
        MyThread2 mt4 = new MyThread2("Daemon Thread 2");
        MyThread2 mt5 = new MyThread2("Daemon Thread 3");

        mt1.setPriority(10);
        mt2.setPriority(10);
        mt3.setPriority(1);
        mt4.setPriority(1);
        mt5.setPriority(1);
        mt3.setDaemon(true);
        mt4.setDaemon(true);
        mt5.setDaemon(true);

        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}
