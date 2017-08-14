package com.czh.memento;

public class Originator {
	private boolean state;
	
	public Originator() {
		state = true;
	}
	
	public void run() {
		state = !state;
	}
	
	public Memento saveState() {
		return new Memento(state);
	}
	
	public void restoreMemento(Memento memento) {
		state = memento.isState();
	}
	
	public void show() {
		System.out.println("now state:" + state);
	}
}
