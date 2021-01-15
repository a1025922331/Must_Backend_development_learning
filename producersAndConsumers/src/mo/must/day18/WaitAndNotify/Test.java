package mo.must.day18.WaitAndNotify;

public class Test {
    public static void main(String[] args){
        //设置销售上限10个，
        Counter counter = new Counter(10);

        Producers producer1 = new Producers("生产者1",counter);
        Consumers consumer1 = new Consumers("消费者1",counter);
        Consumers consumer2 = new Consumers("消费者2",counter);

        producer1.start();
        consumer1.start();
        consumer2.start();
    }
}
