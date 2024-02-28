package com.mashibing.resolveBeforeInstantiation;

public class BeforeInstantiation {

    private String name;

    public void doSomeThing(){
        System.out.println("执行do some thing....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
