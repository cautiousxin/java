package com.fsh.day01.homework05;

public class Director extends Employee{
	private int travelAllowance;
	
	public void show(){
		super.show();
		System.out.println("½»Í¨²¹Öú£º"+travelAllowance);
	}
	
	public Director(String name, String address, int salary,int travelAllowance) {
		super(name,address,salary);
		this.travelAllowance = travelAllowance;
	}
	
	
	
	public Director(){
		super();
	}

	public int getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(int travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	
}
