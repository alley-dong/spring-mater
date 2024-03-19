
package com.mashibing.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class AnotherService {

    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
        System.out.println("AnotherService - MyService 依赖注入执行");
    }

    public AnotherService(){
        System.out.println("AnotherService 无参构造器执行");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("执行了AnotherService的postConstruct()方法。。。");
    }

    public void init() {
        System.out.println("执行了AnotherService的init()方法。。。");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("执行了AnotherService的preDestroy()方法。。。");
    }

    public void destroy() {
        System.out.println("执行了AnotherService的destroy() 方法。。。");
    }
}
