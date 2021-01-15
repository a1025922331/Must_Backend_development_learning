package mo.must.day18.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue(1);

        Producers producer = new Producers("生产者",blockingQueue);
        Consumers consumer1 = new Consumers("消费者1",blockingQueue);
        Consumers consumer2 = new Consumers("消费者2",blockingQueue);

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
