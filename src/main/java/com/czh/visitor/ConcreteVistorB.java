package com.czh.visitor;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 21:05
 * <p>
 * 描述：
 */
public class ConcreteVistorB extends Vistor {
    void visit(ConcreteElementA concreteElementA) {
        System.out.println("concreteElementA 被ConcreteVistorB访问");
    }

    void visit(ConcreteElementB concreteElementB) {
        System.out.println("concreteElementB 被ConcreteVistorB访问");
    }
}
