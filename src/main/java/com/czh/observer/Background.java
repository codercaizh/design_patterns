package com.czh.observer;

public abstract class Background implements Worker{


	String name;
	
	public Background(String name) {
		this.name = name;
	}
	public void addWorker(Worker worker) {
		
	}

	public void notifyWorkers() {
		
	}
}
