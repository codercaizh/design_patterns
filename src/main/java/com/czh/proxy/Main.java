package com.czh.proxy;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：代理模式
 *
 * 设计模式意图：为其他对象提供一种代理以控制对这个对象的访问。
 *
 * 适用性：
 *
 * 1、远程代理（Remote Proxy）为一个对象在不同的地址空间提供局部代表。
 *
 * 2、虚代理（Virtual Proxy）根据需要创建开销很大的对象。
 *
 * 3、保护代理（Protection Proxy）控制对原始对象的访问。保护代理用于对象应该有不同 的访问权限的时候。
 *
 * 4、智能指引（Smart Reference）取代了简单的指针，它在访问对象时执行一些附加操作。 它的典型用途包括：
 *    4.1 对指向实际对象的引用计数，这样当该对象没有引用时，可以自动释放它（也称为SmartPointers）。
 *
 *    4.2 当第一次引用一个持久对象时，将它装入内存。
 *
 *    4.3 在访问一个实际对象前，检查是否已经锁定了它，以确保其他对象不能改变它。
 *
 */
public class Main {
    public static void main(String[] args) {
        Trans boss = new Boss();
        boss.getMoney(5000);
        boss.send();

        Trans proxyBoss = new ProxyBoss();
        proxyBoss.getMoney(5000);
        proxyBoss.send();
    }
}
