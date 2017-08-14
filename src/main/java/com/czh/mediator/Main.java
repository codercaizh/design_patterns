package com.czh.mediator;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：中介模式
 *
 * 设计模式意图：用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * 适用性：
 *
 * 1、一组对象以定义良好但是复杂的方式进行通信。产生的相互依赖关系结构混乱且难以理解。
 *
 * 2、一个对象引用其他很多对象并且直接与这些对象通信,导致难以复用该对象。
 *
 * 3、想定制一个分布在多个类中的行为，而又不想生成太多的子类。
 *
 */
public class Main {
    public static void main(String[] args) {
        Colleague colleagueA = new ColleagueA();
        Colleague colleagueB = new ColleagueB();
        Mediator mediator = new SimpleMediator(colleagueA,colleagueB);
        colleagueA.setMediator(mediator);
        colleagueB.setMediator(mediator);
        colleagueA.handler("hello world");
    }
}
