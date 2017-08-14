package com.czh.builder;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：建造者模式
 *
 * 设计模式意图：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 适用性：
 *
 * 1、当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
 *
 * 2、当构造过程必须允许被构造的对象有不同的表示时。
 *
 */
public class Main{

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Meal mealOne = waiter.getMealOne();
        System.out.println(mealOne);
    }
}
