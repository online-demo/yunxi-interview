package com.yunxi.interviewdemo.test.thread.join;

/**
 * @Author 无双老师
 * @Date 2018/9/18
 * @Description 测试join
 */
public class JoinTest {
    public static void main(String[] args) {
        Father father = new Father("Father Thread");
        father.start();
    }
}
