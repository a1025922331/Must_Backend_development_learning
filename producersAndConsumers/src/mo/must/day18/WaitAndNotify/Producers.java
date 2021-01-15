package mo.must.day18.WaitAndNotify;

public class Producers extends Thread {
    private static Counter counter;
    private static Object lock;

    public Producers(String name, Counter counter) {
        super(name);
        this.counter = counter;
        lock = counter.getLock();
    }

    @Override
    public void run() {
        //模板：
        //1.while(true)循环
        //2.synchronized,锁对象唯一
        //3.判断是否访问结束，结束
        //4.判断是否访问结束，不结束
        while (true) {
            synchronized (lock) {
                if (counter.getProductCount() == 0) {
                    break;
                } else {
                    //今天还可以接着生产
                    if (counter.isFlag()) {
                        //桌上还有产品未消费，暂时不生产，进入等待状态
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //桌上已经没有产品了，开始生产
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(getName() + "生产了一个商品");
                        counter.setFlag(true);
                        //唤醒消费者
                        lock.notifyAll();
                    }
                }
            }
        }
    }
}
