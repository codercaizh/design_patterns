package com.czh.decorator;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：装饰模式
 *
 * 设计模式意图：动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。
 *
 * 适用性：
 *
 * 1、在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
 *
 * 2、处理那些可以撤消的职责。
 *
 * 3、当不能采用生成子类的方法进行扩充时。一种情况是，可能有大量独立的扩展，为支持每一种组合将产生大量的子类，使得子类数目呈爆炸性增长。另一种情况可能是因为类定义被隐藏，或类定义不能用于生成子类。
 *
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Enjoy enjoy = new Enjoy();
        Play play = new Play();
//        person.doSomeThing();
//        System.out.println("------");
//        enjoy.setPerson(enjoy);
//        enjoy.doSomeThing();
//        System.out.println("------");
//        play.setPerson( person);
//        play.doSomeThing();
//        System.out.println("------");
//        enjoy.setPerson(person);
//        play.setPerson(enjoy);
//        play.doSomeThing();
//        System.out.println("------");
        play.setPerson(person);
        enjoy.setPerson(play);
        enjoy.doSomeThing();


    }
}
