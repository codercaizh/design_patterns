package com.czh.observer;

public abstract class Foreground implements Worker{

	String name;
	
    String content;
	
	public Foreground(String name) {
		this.name = name;
	}
	
	public void handlerNotify(String content) {
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
