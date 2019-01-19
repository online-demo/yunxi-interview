package com.yunxi.interviewdemo.test.lock.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 云析学院【无双老师】
 * @Date 2018/9/19
 * @Description 所谓公平锁，就是按照时间先后顺序，使先等待的线程先得到锁，
 * 只要排队等待，最终能等待到获取锁的机会
 */
public class FairLockDemo implements Runnable {
    /**
     * 公平锁为例
     */
    private Lock lock;

    public int count;

    public FairLockDemo () {

    }

    public FairLockDemo (Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (lock != null) {
            try {
                lock.lock();
                count++;
            } finally {
                lock.unlock();
            }
        } else {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 无锁
        FairLockDemo test = new FairLockDemo();
        withoutLock(test);


        // 有锁
//        ReentrantLock lock = new ReentrantLock(true);
//        FairLockDemo test = new FairLockDemo(lock);
//        withLock(test);


        Thread.sleep(1000);
        System.out.println("计算结果=" + test.count);
    }

    /**
     * 无锁
     */
    public static void withoutLock(FairLockDemo test) {
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(test, "线程" + i);
            t1.start();
        }
    }

    /**
     * 有锁
     */
    public static void withLock(FairLockDemo test) {
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(test, "线程" + i);
            t1.start();
        }
    }
}
