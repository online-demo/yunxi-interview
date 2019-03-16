package com.yunxi.interviewdemo.test.latch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-03-13
 * @Description:
 */
public class Student implements Runnable {

    private CountDownLatch downLatch;
    private String name;

    public Student(CountDownLatch downLatch, String name){
        this.downLatch = downLatch;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在答题!");
        try{
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        }catch(InterruptedException ie){
        }
        System.out.println(this.name + "交卷了！");
        this.downLatch.countDown();
    }
}
