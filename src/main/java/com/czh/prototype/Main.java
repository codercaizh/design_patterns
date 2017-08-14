package com.czh.prototype;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：原型模式
 *
 * 设计模式意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * 适用性：
 *
 * 1、当要实例化的类是在运行时刻指定时，例如，通过动态装载；或者
 *
 * 2、为了避免创建一个与产品类层次平行的工厂类层次时；或者
 *
 * 3、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 *
 */
public class Main {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        objectA.setName("hello");
        ObjectA objectB = (ObjectA) objectA.clone();
        System.out.println(objectB.getName());
        System.out.println(objectA == objectB);
    }
}
