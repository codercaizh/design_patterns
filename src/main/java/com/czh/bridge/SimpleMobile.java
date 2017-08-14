package com.czh.bridge;

/**
 * Created by caizh on 2017-08-13.
 */
public abstract class SimpleMobile implements Mobile{
    protected String mobileName;

    protected MobileGame mobileGame;

    public SimpleMobile(String name){
        mobileName = name;
    }

    public void installGame(MobileGame mobileGame) {
        this.mobileGame = mobileGame;
    }
}
