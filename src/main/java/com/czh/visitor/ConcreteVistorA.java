package com.czh.visitor;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 20:59
 * <p>
 * 描述：
 */
public class ConcreteVistorA extends Vistor {

    void visit(ConcreteElementA concreteElementA) {
        System.out.println("concreteElementA 被ConcreteVistorA访问");
    }

    void visit(ConcreteElementB concreteElementB) {
        System.out.println("concreteElementB 被ConcreteVistorA访问");
    }
}
