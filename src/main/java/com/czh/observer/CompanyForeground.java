package com.czh.observer;

import java.util.ArrayList;
import java.util.List;

public class CompanyForeground extends Foreground{

	public CompanyForeground(String name) {
		super(name);
	}

	private List<Worker> workers = null;
	
	
	
	public void addWorker(Worker worker) {
		if(workers == null ) {
			workers = new ArrayList<Worker>();
		}
		workers.add(worker);
	}

	public void notifyWorkers() {
		if(workers != null && workers.size() >0) {
			for(Worker worker : workers) {
				worker.handlerNotify(name+"发起的通知，内容为" + content);
			}
		}
	}

}
