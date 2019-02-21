package test;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * create by xiejiedun on 2018/11/29
 */
public class FutureTest1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Long> [] futures = new Future[20];
        for (int i=0;i<20;i++) {
            futures[i] = service.submit(new Task());
        }
        for (Future<Long> future:futures) {
            System.out.println(future.get());
        }
    }

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Long> [] futures = new Future[20];
        for (int i=0;i<20;i++) {
            futures[i] = service.submit(new Task());
        }
        for (Future<Long> future:futures) {
            System.out.println(future.get());
        }
    }

}
class Task implements Callable<Long>{

    @Override
    public Long call() throws Exception {
        long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"执行开始时间: "+start);
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"执行完时间: "+end);
        return end-start;
    }
}


