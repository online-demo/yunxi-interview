package com.yunxi.interviewdemo.test.spring.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author 云析学院【无双老师】
 * @Date 2018/09/04
 * @Description 工厂级生命周期
 */
public class Factory implements BeanFactoryPostProcessor {

    /**
     * 构造器
     */
    public Factory() {
        System.out.println("一  Factory()");
    }

    /**
     * Bean实例化之前
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("二  postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)");
    }
}
