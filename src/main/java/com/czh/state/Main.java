package com.czh.state;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：状态模式
 *
 * 设计模式意图：允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 *
 * 适用性：
 *
 * 1、一个对象的行为取决于它的状态, 并且它必须在运行时刻根据状态改变它的行为。
 *
 * 2、一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。这个状态通常用一个或多个枚举常量表示。通常, 有多个操作包含这一相同的条件结构。State模式将每一个条件分支放入一个独立的类中。这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化。
 *
 */
public class Main {
   public static void main(String[] args) {
	   Breast breast = new Breast();
	   breast.setSalary(500.0);
	   System.out.println(breast.getNowBreast());
	//   System.out.println(breast.isBuyHouseAble());
	   breast.setSalary(2000.0);
	   System.out.println(breast.getNowBreast());
	//   System.out.println(breast.isBuyHouseAble());
	   breast.setSalary(4000.0);
	   System.out.println(breast.getNowBreast());
	 //  System.out.println(breast.isBuyHouseAble());
	   breast.setSalary(6001.0);
	   System.out.println(breast.getNowBreast());
	 //  System.out.println(breast.isBuyHouseAble());
   }
}
