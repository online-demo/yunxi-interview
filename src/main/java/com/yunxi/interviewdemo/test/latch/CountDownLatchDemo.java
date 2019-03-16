package com.yunxi.interviewdemo.test.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-03-13
 * @Description:
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        CountDownLatch latch = new CountDownLatch(3);

        Student w1 = new Student(latch,"张三");
        Student w2 = new Student(latch,"李四");
        Student w3 = new Student(latch,"王五");

        Teacher teacher = new Teacher(latch);
        executor.execute(teacher);
        executor.execute(w1);
        executor.execute(w2);
        executor.execute(w3);
        executor.shutdown();
    }
}
