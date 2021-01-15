package mo.must.day19;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //使用匿名内部类创建线程
        Thread threadTest = new Thread(() -> {
            System.out.println("2.在执行start()，即开启线程后用户线程的状态为：" + Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4.在等待时间结束后用户线程的状态为：" + Thread.currentThread().getState());
        }, "用户线程");

        System.out.println("1.在创建线程对象后用户线程的状态为：" + threadTest.getState());

        //开启用户线程
        threadTest.start();

        //main线程等待500ms，此时用户线程还在等待
        Thread.sleep(500);
        System.out.println("3.在执行wait()后用户线程的状态为：" + threadTest.getState());

        //main线程等待1000ms,此时用户线程已经结束
        Thread.sleep(1000);
        System.out.println("5.在run()执行结束后用户线程的状态为：" + threadTest.getState());
    }
}
