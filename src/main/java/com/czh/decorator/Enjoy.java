package com.czh.decorator;

/**
 * Created by a5453 on 2017-07-28.
 */
public class Enjoy extends SomeThing {
    public void listenMusic(){
        System.out.println("听音乐");
    }
    @Override
    public void doSomeThing() {
        listenMusic();
        super.doSomeThing();
    }

}
