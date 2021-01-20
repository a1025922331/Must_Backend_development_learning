package mo.must.day20;

public class Volatile {
    public static void main(String[] args){
        BoyRunnable boyRunnable = new BoyRunnable();
        GirlRunnable girlRunnable = new GirlRunnable();

        new Thread(girlRunnable,"girl").start();
        new Thread(boyRunnable,"boy").start();
    }
}

class Bank{
    static volatile int money = 1000;
}

class BoyRunnable implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bank.money = 900;
    }
}

class GirlRunnable implements Runnable{

    @Override
    public void run() {
        while(Bank.money==1000){
        }
        System.out.println("有人偷袭！");
    }
}
