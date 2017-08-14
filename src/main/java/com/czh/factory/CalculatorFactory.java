package com.czh.factory;

public class CalculatorFactory {
	public static ICalculator getCalculator(CalculatorType type) {
		switch(type) {
			case ADD:{
				return new AddCalculator();
			}
			case MULTIPLIED:{
				return new MultipliedCalculator();
			}
			default:{
				return null;
			}
		}
	}
}
