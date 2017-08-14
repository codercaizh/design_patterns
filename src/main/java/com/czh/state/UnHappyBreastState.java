package com.czh.state;

public class UnHappyBreastState extends BreastState {
	public String getNowBreast(Breast breast) {
		if(breast.getSalary()<=3000) {
			return "超级不爽";
		}
		return new BadBreastState().getNowBreast(breast);
	}

}
