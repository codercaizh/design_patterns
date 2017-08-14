package com.czh.state;

public class AngryBreastState extends BreastState{
	public String getNowBreast(Breast breast) {
		if(breast.getSalary()<=500) {
			return "辞职";
		}
		return new UnHappyBreastState().getNowBreast(breast);
	}
}
