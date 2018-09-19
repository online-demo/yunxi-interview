package com.yunxi.interviewdemo.test.lock.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 云析学院【无双老师】
 * @Date 2018/9/19
 * @Description 所谓公平锁，就是按照时间先后顺序，使先等待的线程先得到锁，
 * 公平锁不会产生饥饿锁，也就是只要排队等待，最终能等待到获取锁的机会
 */
public class FairLockDemo implements Runnable {
    //公平锁
//    public static ReentrantLock lock = new ReentrantLock(true);
    //非公平锁
    public static ReentrantLock lock = new ReentrantLock(false);
    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "获取到了锁！");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FairLockDemo test = new FairLockDemo();
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(test, "线程" + i);
            t1.start();
        }
    }
}
