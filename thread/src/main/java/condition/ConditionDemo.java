package condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * czl
 * createTime:2020/1/25
 */
public class ConditionDemo {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
       new Thread(new ConditionAwait(lock,condition)).start();
       new Thread(new ConditionSignal(lock,condition)).start();
    }
}
