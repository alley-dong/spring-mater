package com.mashibing.test;

import org.springframework.beans.factory.BeanNameAware;

public class A implements BeanNameAware {
    // BeanName
    private String name;
    private B b;
    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }

    // 无需自己处理
    @Override
    public void setBeanName(String name) {
        name = name;
    }

    public String getName() {
        return name;
    }
}
