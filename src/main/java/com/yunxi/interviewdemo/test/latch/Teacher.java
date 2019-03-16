package com.yunxi.interviewdemo.test.latch;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-03-13
 * @Description:
 */
public class Teacher implements Runnable {

    private CountDownLatch downLatch;

    public Teacher(CountDownLatch downLatch){
        this.downLatch = downLatch;
    }

    @Override
    public void run() {
        System.out.println("老师正在等所有的学生将试卷交上......");
        try {
            this.downLatch.await();
        } catch (InterruptedException e) {

        }
        System.out.println("所有学生的试卷都已经上交，老师离开考场！");
    }
}
