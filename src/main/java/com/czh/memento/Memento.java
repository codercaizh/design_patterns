package com.czh.memento;

public class Memento {
	
	private boolean state;

	public Memento(boolean state) {
		this.state = state;
	}
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
}
