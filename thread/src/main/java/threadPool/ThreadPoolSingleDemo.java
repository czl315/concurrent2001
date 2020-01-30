package threadPool;

import hashmap.MapPut;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class ThreadPoolSingleDemo implements Runnable {
    static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//    static ExecutorService singleThreadExecutor = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            singleThreadExecutor.execute(new ThreadPoolSingleDemo());
        }
    }

    @Override
    public void run() {
        System.out.println("【"+"单一"+"】运行线程:" + Thread.currentThread().getName());
    }
}
