package mo.must.day18.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producers extends Thread {
    private ArrayBlockingQueue<String> blockingQueue;

    public Producers(String name, ArrayBlockingQueue<String> blockingQueue) {
        super(name);
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                blockingQueue.put("汉堡包");
                System.out.println(getName() + "制作了一个汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
