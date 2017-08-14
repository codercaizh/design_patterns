package com.czh.state;

public class Breast {
	private Double salary;

	private BreastState breastState;
	
	public String getNowBreast() {
		breastState = new InitBreastState();
		return breastState.getNowBreast(this);
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public BreastState getBreastState() {
		return breastState;
	}

	public void setBreastState(BreastState breastState) {
		this.breastState = breastState;
	}
	
	
	
	
	
}
