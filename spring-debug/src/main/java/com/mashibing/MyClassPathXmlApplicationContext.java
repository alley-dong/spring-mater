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
        getEnvironment().setRequiredProperties("user.name");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        /**
         * DefaultListableBeanFactory和AbstractRefreshableApplicationContext是组合的关系。
         * 当对AllowBeanDefinitionOverriding进行修改的时候 要先修改父类的，通过父类修改DefaultListableBeanFactory。
         * super.setAllowBeanDefinitionOverriding(false);
         * super.setAllowCircularReferences(false);
         */

        // 在invokeBeanFactoryPostProcessors方法入参时 获取当前类
        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
        super.customizeBeanFactory(beanFactory);
    }

    // 这里的入参的是beanFactory，当你有了BeanFactory之后 可以对任何东西进行获取和扩展
    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        System.out.println("扩展实现postProcessBeanFactory方法");
    }
}
