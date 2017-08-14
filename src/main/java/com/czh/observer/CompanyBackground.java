package com.czh.observer;

public class CompanyBackground extends Background{

	public CompanyBackground(String name) {
		super(name);
	}

	public void handlerNotify(String content) {
		System.out.println(name + " 接收到通知，内容为：" + content);
	}


}
