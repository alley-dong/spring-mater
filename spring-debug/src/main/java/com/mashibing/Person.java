package com.mashibing;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person {

    private int id;
    private String name;

//    public Person(int id,String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public Person(String name,int id){
//        this.name = name;
//        this.id = id;
//    }
//
//    public Person(String name){
//        this.name = name;
//    }
//

//    private ApplicationContext applicationContext;
//    private BeanFactory beanFactory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ApplicationContext getApplicationContext() {
//        return applicationContext;
//    }
//
//    // 这个set方法有谁来进行调用，是用户还是spring？一定不能是用户，
//    // 我应该什么时候去调用这个方法，怎么调用这个方法？给定好一个约束，在统一的地方对这些set方法来进行调用
//    public void setApplicationContext(ApplicationContext applicationContext) {
//        this.applicationContext = applicationContext;
//    }
//
//    public BeanFactory getBeanFactory() {
//        return beanFactory;
//    }
//
//    public void setBeanFactory(BeanFactory beanFactory) {
//        this.beanFactory = beanFactory;
//    }
}
