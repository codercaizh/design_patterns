package com.czh.flyweight;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 18:22
 * <p>
 * 描述：享元工厂
 */
public interface FlyweightFactory {
    Flyweight getFlyweight(String state);
}
