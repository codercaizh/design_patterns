package com.czh.state;

public class NiceBreastState extends BreastState {
	public String getNowBreast(Breast breast) {
		if(breast.getSalary()>6000) {
			return "爽";
		}
		return "未达标";
	}

	
}
