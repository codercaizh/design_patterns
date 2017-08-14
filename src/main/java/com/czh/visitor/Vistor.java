package com.czh.visitor;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 20:56
 * <p>
 * 描述：观察者类
 */
public abstract class Vistor {
    abstract void visit(ConcreteElementA concreteElementA);
    abstract void visit(ConcreteElementB concreteElementB);
}
