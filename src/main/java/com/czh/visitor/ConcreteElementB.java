package com.czh.visitor;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 20:58
 * <p>
 * 描述：
 */
public class ConcreteElementB extends Element{
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
