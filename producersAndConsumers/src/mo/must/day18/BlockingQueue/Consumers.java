package mo.must.day18.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumers extends Thread{
    private ArrayBlockingQueue<String> blockingQueue;

    public Consumers(String name, ArrayBlockingQueue<String> blockingQueue) {
        super(name);
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String s = blockingQueue.take();
                System.out.println(getName() + "吃了一个" + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
