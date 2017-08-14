package com.czh.iterator;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 22:43
 * <p>
 * 描述：
 */
public class NameIterator implements Iterator {
    private String[] names;
    private int index = 0;
    public NameIterator(String[] names){
        this.names = names;
    }
    public Object next() {
        return names[index++];
    }

    public boolean hasNext() {
        return index <= names.length - 1;
    }
}
