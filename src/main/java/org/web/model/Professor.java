package org.web.model;



public class Professor extends SystemUser {
	
	double salary;
	
	public Professor() {
		super();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
