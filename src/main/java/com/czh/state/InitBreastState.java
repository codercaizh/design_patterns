package com.czh.state;

/**
 * 初始状态
 * @author caizh
 *
 */
public class InitBreastState extends BreastState{

	@Override
	public String getNowBreast(Breast breast) {
		return new AngryBreastState().getNowBreast(breast);
	}


}
