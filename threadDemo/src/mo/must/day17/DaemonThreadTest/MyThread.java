package mo.must.day17.DaemonThreadTest;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "执行到了第" + i + "步");
            if(i==9)
                System.out.println(getName()+"执行完了");
        }
    }
}
