package com.czh.bridge;

/**
 * Created by caizh on 2017-08-13.
 */
public class IPhone extends SimpleMobile{
    public IPhone(String name) {
        super(name);
    }

    public void runGame() {
        System.out.println(mobileName + "直接运行游戏");
        mobileGame.run();
    }
}
