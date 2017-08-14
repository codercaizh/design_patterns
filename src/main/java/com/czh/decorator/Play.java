package com.czh.decorator;

/**
 * Created by a5453 on 2017-07-28.
 */
public class Play extends SomeThing{


    private void palyComputer(){
        System.out.println("玩电脑");
    }

    @Override
    public void doSomeThing() {
        palyComputer();
        super.doSomeThing();
    }
}
