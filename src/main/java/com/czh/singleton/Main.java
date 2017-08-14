package com.czh.singleton;


/**
 * 创建人：菜头君
 *
 * 设计模式名称：单例模式
 *
 * 设计模式意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *
 * 适用性：
 *
 * 1、当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时。
 *
 * 2、当这个唯一实例应该是通过子类化可扩展的，并且客户应该无需更改代码就能使用一个扩展的实例时。
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        hungrySingleton.show();
        lazySingleton.show();
    }
}
