package com.yunxi.interviewdemo.test.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author 云析学院【无双老师】
 * @Date 2018/09/04
 * @Description Bean生命周期
 */
public class Person implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    /**
     * 1. 构造器
     */
    public Person() {
        System.out.println("1 Person()");
    }

    /**
     * 2. BeanNameAware接口方法实现
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("2 setBeanName(String name)");
    }

    /**
     * 3. ApplicationContextAware接口方法实现
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3 setApplicationContext(ApplicationContext applicationContext)");
    }

    /**
     * 4. InitializingBean接口方法实现
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4 afterPropertiesSet()");
    }

    /**
     * 5. init-method属性指定的方法
     */
    public void lifecycleInit() {
        System.out.println("5 lifecycleInit()");
    }

    /**
     * 6. Bean中的业务方法
     */
    public void sayHello() {
        System.out.println("6 sayHello()");
    }

    /**
     * 7. DisposableBean接口方法实现
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("7 destroy()");
    }

    /**
     * 8. destroy-method属性指定的方法
     */
    public void lifecycleInitDestroy() {
        System.out.println("8 lifecycleInitDestroy()");
    }
}
