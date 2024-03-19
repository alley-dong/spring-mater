package com.mashibing.init;

public class MyService {
    public MyService(){
        System.out.println("MyService 无参构造器执行");
    }
    
    public void init() {
        System.out.println("MyService started.");
    }

    public void destroy() {
        System.out.println("MyService shutdown.");
    }
}
