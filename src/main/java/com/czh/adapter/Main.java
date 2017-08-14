package com.czh.adapter;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：适配器模式
 *
 * 设计模式意图：将一个类的接口转换成另外一个客户希望的接口。Adapter 模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 * 适用性：
 *
 * 1、你想使用一个已经存在的类，而它的接口不符合你的需求。
 *
 * 2、你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口可能不一定兼容的类）协同工作。
 *
 * 3、（仅适用于对象Adapter）你想使用一些已经存在的子类，但是不可能对每一个都进行子类化以匹配它们的接口。对象适配器可以适配它的父类接口。
 *
 */
public class Main {
	public static void main(String[] args) {
		Home home = new HomeAdapter(new SchoolDoor());
		home.login(5);
	}
}
