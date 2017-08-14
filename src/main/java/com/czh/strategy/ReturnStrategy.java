package com.czh.strategy;

public class ReturnStrategy extends Strategy{

	private double rebate;
	
	public ReturnStrategy(double rebate) {
		this.rebate = rebate;
	}
	
	public int getResult(int money) {
		return (int) (money * this.getRebate());
	}
	
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	
	
}
