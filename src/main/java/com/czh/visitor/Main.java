package com.czh.visitor;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：访问者模式
 *
 * 设计模式意图：表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 *
 * 适用性：
 *
 * 1、一个对象结构包含很多类对象，它们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作。
 *
 * 2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。Visitor使得你可以将相关的操作集中起来定义在一个类中。当该对象结构被很多应用共享时，用Visitor模式让每个应用仅包含需要用到的操作。
 *
 * 3、定义对象结构的类很少改变，但经常需要在此结构上定义新的操作。改变对象结构类需要重定义对所有访问者的接口，这可能需要很大的代价。如果对象结构类经常改变，那么可能还是在这些类中定义这些操作较好。
 *
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());
        Vistor vistorA = new ConcreteVistorA();
        Vistor vistorB = new ConcreteVistorB();
        objectStructure.accept(vistorA);
        objectStructure.accept(vistorB);
    }
}
