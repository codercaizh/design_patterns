package com.czh.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 18:28
 * <p>
 * 描述：简单享元对象工厂
 */
public class SimpleFlyweightFactory implements FlyweightFactory {
    private Map flyweightMap = new HashMap();
    private static SimpleFlyweightFactory simpleFlyweightFactory;
    private SimpleFlyweightFactory(){
        if(simpleFlyweightFactory !=null){
            throw new RuntimeException("单例模式");
        }
    }
    public static FlyweightFactory getFactory(){
        if(simpleFlyweightFactory == null){
            synchronized (SimpleFlyweightFactory.class){
                if(simpleFlyweightFactory == null){
                    simpleFlyweightFactory = new SimpleFlyweightFactory();
                }
            }
        }
        return simpleFlyweightFactory;
    }

    public Flyweight getFlyweight(String state) {
        Flyweight flyweight = (Flyweight) flyweightMap.get(state);
        if(flyweight == null){
            synchronized (SimpleFlyweightFactory.class){
                if(flyweightMap.get(state) == null){
                    if("A".equals(state)){
                        flyweight = new ConcreteFlyweightA();
                    }else if("B".equals(state)){
                        flyweight = new ConcreteFlyweightB();
                    }
                    flyweightMap.put(state,flyweight);
                }
            }
        }
        return flyweight;
    }
}
