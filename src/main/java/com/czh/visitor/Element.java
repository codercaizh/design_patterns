package com.czh.visitor;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 20:57
 * <p>
 * 描述：
 */
public abstract class Element {
    public abstract void accept(Vistor vistor);
}
