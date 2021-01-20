package mo.must.day20;

public class Synchronized {
    public static void main(String[] args) {
        BoyRunnable2 boyRunnable = new BoyRunnable2();
        GirlRunnable2 girlRunnable = new GirlRunnable2();

        new Thread(girlRunnable, "girl").start();
        new Thread(boyRunnable, "boy").start();
    }
}

class Bank2 {
    static int money = 1000;
    static Object lock = new Object();
}

class BoyRunnable2 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (Bank2.lock) {
            Bank2.money = 900;
        }
    }
}

class GirlRunnable2 implements Runnable {

    @Override
    public void run() {

        while (true) {
            synchronized (Bank2.lock) {
                if (Bank2.money != 1000) {
                    System.out.println("有人偷袭！");
                    break;
                }
            }
        }
    }
}