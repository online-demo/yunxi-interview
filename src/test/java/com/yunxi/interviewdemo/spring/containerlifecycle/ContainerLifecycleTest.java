package com.yunxi.interviewdemo.spring.containerlifecycle;

import com.yunxi.interviewdemo.test.spring.beanlifcycle.BeanLifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 无双
 * @Date 2018/09/04
 * @Description Bean级生命周期+容器级生命周期测试
 */
public class ContainerLifecycleTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring-chapter2-beanlifecycle.xml",
                "classpath:spring-chapter2-containerlifecycle.xml");
        BeanLifecycle beanLifecycle = context.getBean("beanLifecycle",BeanLifecycle.class);
        beanLifecycle.sayHello();
        context.close();
    }
}
