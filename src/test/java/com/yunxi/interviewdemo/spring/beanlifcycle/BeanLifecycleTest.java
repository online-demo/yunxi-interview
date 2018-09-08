package com.yunxi.interviewdemo.spring.beanlifcycle;

import com.yunxi.interviewdemo.test.spring.beanlifcycle.BeanLifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 无双
 * @Date 2018/09/04
 * @Description Bean生命周期测试
 */
public class BeanLifecycleTest {

    public static void main(String[] args) {
        //只启动BeanLifecycle这一个Bean，观察效果
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring-chapter2-beanlifecycle.xml");
        BeanLifecycle beanLifecycle = context.getBean("beanLifecycle",BeanLifecycle.class);
        beanLifecycle.sayHello();
        context.close();
    }

}
