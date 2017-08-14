package com.czh.observer;

public interface Worker {

	void handlerNotify(String content);
	
	void addWorker(Worker worker);
	
	void notifyWorkers();
}
