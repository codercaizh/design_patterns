package com.czh.decorator;

/**
 * Created by a5453 on 2017-07-28.
 */
public class Person {

    private String name;

    private String id;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void doSomeThing(){
        eat();
        sleep();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
