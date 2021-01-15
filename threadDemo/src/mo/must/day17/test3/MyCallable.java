package mo.must.day17.test3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        return "线程" + Thread.currentThread().getName() + "的执行结果";
    }
}
