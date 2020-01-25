package condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * czl
 * createTime:2020/1/25
 */
public class ConditionSignal implements Runnable {
    Lock lock;
    Condition condition;

    public ConditionSignal(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"-start-");
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"-condition.signal()-start-");
            condition.signal();
            System.out.println(Thread.currentThread().getName()+"-condition.signal()-end-");
            System.out.println(Thread.currentThread().getName()+"-end-");
        }finally {
            lock.unlock();
        }
    }
}
