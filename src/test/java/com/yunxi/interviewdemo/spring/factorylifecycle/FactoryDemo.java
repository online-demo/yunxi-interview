package com.yunxi.interviewdemo.spring.factorylifecycle;

import com.yunxi.interviewdemo.test.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 无双
 * @Date 2018/09/04
 * @Description
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring-chapter2-person.xml",
                "classpath:spring-chapter2-container.xml", "spring-chapter2-factory.xml");
        Person beanLifecycle = context.getBean("beanLifecycle",Person.class);
        beanLifecycle.sayHello();
        context.close();
    }
}
