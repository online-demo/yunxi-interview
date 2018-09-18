package com.yunxi.interviewdemo.spring.beanlifcycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 无双
 * @Date 2018/09/04
 * @Description Bean生命周期测试
 */
public class PersonDemo {

    public static void main(String[] args) {
        //只启动BeanLifecycle这一个Bean，观察效果
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring-chapter2-person.xml");
        com.yunxi.interviewdemo.test.spring.bean.Person beanLifecycle = context.getBean("beanLifecycle", com.yunxi.interviewdemo.test.spring.bean.Person.class);
        beanLifecycle.sayHello();
        context.close();
    }

}
