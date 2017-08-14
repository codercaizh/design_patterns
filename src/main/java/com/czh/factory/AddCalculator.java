package com.czh.factory;

public class AddCalculator implements ICalculator{


	public Object getResult(Object param1, Object param2) {
		return  Integer.parseInt(String.valueOf(param1)) + Integer.parseInt(String.valueOf(param2));
	}
}
