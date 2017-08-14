package com.czh.iterator;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：迭代器模式
 *
 * 设计模式意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又不需暴露该对象的内部表示。
 *
 * 适用性：
 *
 * 1、访问一个聚合对象的内容而无需暴露它的内部表示。
 *
 * 2、支持对聚合对象的多种遍历。
 *
 * 3、为遍历不同的聚合结构提供一个统一的接口（即, 支持多态迭代）。
 *
 */
public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"小米","小红","校长","哈哈"};
        Container container = new NameList(names);
        Iterator iterator = container.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
