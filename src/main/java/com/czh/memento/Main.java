package com.czh.memento;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：备忘录模式
 *
 * 设计模式意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到保存的状态。
 *
 * 适用性：
 *
 * 1、必须保存一个对象在某一个时刻的(部分)状态, 这样以后需要时它才能恢复到先前的状态。
 *
 * 2、如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。
 *
 */
public class Main {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		//显示初始状态
		originator.show();
		//存档
		caretaker.setMemento(originator.saveState());
		//运行
		originator.run();
		//显示运行后的状态
		originator.show();
		//回档
		originator.restoreMemento(caretaker.getMemento());
		//显示回档后的状态
		originator.show();
	}
	
	
	
}
