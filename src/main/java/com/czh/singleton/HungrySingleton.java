package com.czh.singleton;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 1:42
 * <p>
 * 描述：饿汉式单例模式
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("can't constructor");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public void show(){
        System.out.println("i am HungrySingleton");
    }
}
