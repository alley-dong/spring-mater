package com.mashibing.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /**
     * 当init方法在 MyService(依赖注入)中，执行顺序为
     *
     * AnotherService构造器初始化 -> MyService构造器初始化  ->  init()  ->
     * AnotherService依赖注入  ->  postConstruct() -> preDestroy()  -> destroy()  ->  Bean销毁
     */
    @Bean
//    @Bean(initMethod="init", destroyMethod="destroy")
    public MyService myService() {
        return new MyService();
    }

    /**
     * 这种方法 可能会比较合理。。
     * 当init方法在当前Bean中，执行顺序为
     *
     * AnotherService构造器初始化 -> MyService构造器初始化  ->  AnotherService依赖注入  ->
     * postConstruct() -> init()  ->  preDestroy()  -> destroy()  ->  Bean销毁
     */
    @Bean(initMethod="init", destroyMethod="destroy")
    public AnotherService anotherService() {
        return new AnotherService();
    }
}
