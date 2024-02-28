package com.mashibing.resolveBeforeInstantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        /**
         * 通过实现InstantiationAwareBeanPostProcessor接口（BeanPostProcessor子接口） 来通过动态代理状态Bean对象（可以不通过doGetBean创建）
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("resolveBeforeInstantiation.xml");
        BeforeInstantiation bean = ac.getBean(BeforeInstantiation.class);
        bean.doSomeThing();
    }
}
