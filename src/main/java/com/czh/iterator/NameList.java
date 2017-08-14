package com.czh.iterator;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 22:42
 * <p>
 * 描述：
 */
public class NameList implements Container{
    String[] names;

    public NameList(String[] names){
        this.names = names;
    }
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
