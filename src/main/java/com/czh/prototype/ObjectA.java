package com.czh.prototype;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 21:16
 * <p>
 * 描述：
 */
public class ObjectA implements Clone{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clone clone() {
        ObjectA objectA = new ObjectA();
        objectA.setName(name);
        return objectA;
    }
}
