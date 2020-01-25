package locks.demo.reentrantwriteread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import lombok.extern.slf4j.Slf4j;

/**
 * @author one3c-chenzhilong9
 * @Description:
 * @Date 2019/12/9
 * @Time 15:08
 */
@Slf4j
public class WriteLock implements Runnable {

    ReentrantReadWriteLock lock;

    public WriteLock(ReentrantReadWriteLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            //lock.writeLock().lockInterruptibly();
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName() + "-lock.writeLock().lock()");
            Thread.sleep(1000);
            System.out.println("写锁是独占的。。。");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
            System.out.println(Thread.currentThread().getName() + "-lock.writeLock().unlock()");
        }
    }
}


