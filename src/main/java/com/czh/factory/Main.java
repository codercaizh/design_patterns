package com.czh.factory;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：工厂模式
 *
 * 设计模式意图：定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method 使一个类的实例化延迟到其子类。
 *
 * 适用性：
 *
 * 1、当一个类不知道它所必须创建的对象的类的时候。
 *
 * 2、当一个类希望由它的子类来指定它所创建的对象的时候。
 *
 * 3、当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Integer param1 = 10;
		Integer param2 = 10;
		int result;
		ICalculator addCalculator = CalculatorFactory.getCalculator(CalculatorType.ADD);
		result = (Integer) addCalculator.getResult(param1, param2);
		System.out.println("addCalculator:" + result);
		ICalculator multiCalcula = CalculatorFactory.getCalculator(CalculatorType.MULTIPLIED);
		result = (Integer) multiCalcula.getResult(param1, param2);
		System.out.println("multiCalcula:" + result);
	}
	
	
}
