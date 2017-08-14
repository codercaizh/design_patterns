package com.czh.singleton;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 1:28
 * <p>
 * 描述：懒汉式/饱汉式单例模式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton(){
        if(lazySingleton != null){
            throw new RuntimeException("can't constructor");
        }
    }
    public static LazySingleton getInstance(){
        System.out.println("instance");
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public void show(){
        System.out.println("i am LazySingleton");
    }
}
