package condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * czl
 * createTime:2020/1/25
 */
public class ConditionAwait implements Runnable {
    Lock lock;
    Condition condition;

    public ConditionAwait(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try {
            try {
                System.out.println(Thread.currentThread().getName()+"-start-");
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"-condition.await()-start-");
                condition.await();
                System.out.println(Thread.currentThread().getName()+"-condition.await()-end-");
                System.out.println(Thread.currentThread().getName()+"-end-");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }finally {
            lock.unlock();
        }

    }
}
