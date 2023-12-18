package com.mashibing;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {


    public MyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        System.out.println("扩展initPropertySource");
//        getEnvironment().setRequiredProperties("username");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        /**
         * DefaultListableBeanFactory和AbstractRefreshableApplicationContext是组合的关系。
         * 当对AllowBeanDefinitionOverriding进行修改的时候 要先修改父类的，通过父类修改DefaultListableBeanFactory。
         * super.setAllowBeanDefinitionOverriding(false);
         * super.setAllowCircularReferences(false);
         */
//        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
        super.customizeBeanFactory(beanFactory);
    }

    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        System.out.println("扩展实现postProcessBeanFactory方法");
    }
}
