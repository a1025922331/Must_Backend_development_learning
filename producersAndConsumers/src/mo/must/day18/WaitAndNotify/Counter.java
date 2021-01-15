package mo.must.day18.WaitAndNotify;

public class Counter {
    //今日总共还可以生产多少个
    private int productCount;
    //锁对象
    private final Object lock = new Object();
    //柜台上有没有汉堡包，没有的话生产者生产，有的话消费者消费
    private boolean flag = false;

    public Counter(int productCount) {
        this.productCount = productCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Object getLock() {
        return lock;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "productCount=" + productCount +
                ", lock=" + lock +
                ", flag=" + flag +
                '}';
    }
}
