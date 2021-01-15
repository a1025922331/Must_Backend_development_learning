package mo.must.day18.WaitAndNotify;

public class Consumers extends Thread {
    private static Counter counter;
    private static Object lock;

    public Consumers(String name, Counter counter) {
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
                    if (counter.isFlag()) {
                        //桌上有吃的
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(getName() + "吃了一个汉堡包");
                        counter.setProductCount(counter.getProductCount() - 1);
                        counter.setFlag(false);
                        lock.notifyAll();//当拥有该锁对象的monitor后才可以使用notify语句,执行往后并不会马上释放锁，
                                         //只是唤醒之前调用过该锁对象的wait方法的线程可以开始竞争该锁对象了，等到同步代码块执行结束才释放锁
                    } else {
                        //桌上没吃的
                        try {
                            lock.wait(); //当拥有该锁对象的monitor后才可以使用wait语句，执行往后会自动释放锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
