package com.czh.observer;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：观察者模式
 *
 * 设计模式意图：定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时, 所有依赖于它的对象都得到通知并被自动更新。
 *
 * 适用性：
 *
 * 1、当一个抽象模型有两个方面, 其中一个方面依赖于另一方面。将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。
 *
 * 2、当对一个对象的改变需要同时改变其它对象, 而不知道具体有多少对象有待改变。
 *
 * 3、当一个对象必须通知其它对象，而它又不能假定其它对象是谁。换言之，你不希望这些对象是紧密耦合的。
 *
 */
public class Main {
	public static void main(String[] args) {
		Foreground foreground = new CompanyForeground("小红");
		Worker background1 = new CompanyBackground("小明");
		Worker background2 = new CompanyBackground("老王");
		Worker background3 = new CompanyBackground("小李");
		
		foreground.addWorker(background1);
		foreground.addWorker(background2);
		foreground.addWorker(background3);
		foreground.addWorker(new Background("所有同事") {
			public void handlerNotify(String content) {
				System.out.println("其它所有同事接收到了：" + content);
			}
		});
		foreground.setContent("老板来了");
		foreground.notifyWorkers();
	}
}
