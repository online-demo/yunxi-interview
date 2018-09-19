package com.yunxi.interviewdemo.test.thread.join;

/**
 * @Author 云析学院【无双老师】
 * @Date 2018/9/18
 * @Description 子线程
 */
public class Son extends Thread {
    @Override
    public void run() {
        //模拟子线程耗时操作，观察父线程的表现
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是子线程Son");
    }
}
