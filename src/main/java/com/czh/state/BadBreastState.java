package com.czh.state;

public class BadBreastState extends BreastState{

	@Override
	public String getNowBreast(Breast breast) {
		return "不爽";
//		if(breast.getSalary()<=6000) {
//			return "不爽";
//		}else {
//			return new NiceBreastState().getNowBreast(breast);
//			
//		}
	}


}
