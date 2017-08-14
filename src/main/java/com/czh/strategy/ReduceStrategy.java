package com.czh.strategy;

public class ReduceStrategy extends Strategy{

	private int money;
	
	private int reduceMoney;
	
	public ReduceStrategy(int money, int reduceMoney) {
		super();
		this.money = money;
		this.reduceMoney = reduceMoney;
	}

	public int getResult(int money) {
		if(money>getMoney()) {
			return money - getReduceMoney();
		}else {
			return money;
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getReduceMoney() {
		return reduceMoney;
	}

	public void setReduceMoney(int reduceMoney) {
		this.reduceMoney = reduceMoney;
	}
	
	

}
