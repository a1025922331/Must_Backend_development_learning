package mo.must.day17.syschronized;
//继承thread方式实现多线程
//使用同步代码块实现同步

public class SynchronizedTest1 {
    public static void main(String[] args) {
        SellTicketsThread stt1 = new SellTicketsThread("窗口1");
        SellTicketsThread stt2 = new SellTicketsThread("窗口2");
        SellTicketsThread stt3 = new SellTicketsThread("窗口3");

        stt1.start();
        stt2.start();
        stt3.start();
    }
}
