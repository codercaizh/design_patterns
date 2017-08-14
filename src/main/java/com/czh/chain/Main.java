package com.czh.chain;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：职责链模式
 *
 * 设计模式意图：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 * 适用性：
 *
 * 1、有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
 *
 * 2、你想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 *
 * 3、可处理一个请求的对象集合应被动态指定。
 *
 */
public class Main {
    public static void main(String[] args) {
        Manager boss = new Boss();
        Manager cfo = new CFO();
        Manager hr = new HR();

        cfo.setHighManager(boss);
        hr.setHighManager(cfo);
        int[] contexts = new int[]{1000,4000,7000,20000};
        for(int context :contexts){
            System.out.println("职员：我想要薪水涨:"+context+"元");
            hr.handler(context);
            System.out.println("谈话结束");
        }
    }
}
