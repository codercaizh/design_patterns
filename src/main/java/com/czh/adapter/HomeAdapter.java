package com.czh.adapter;

public class HomeAdapter implements Home{

	School school;
	
	public HomeAdapter(School school) {
		this.school = school;
	}
	public void login(int id) {	
		school.login("" + id);
	}

}
