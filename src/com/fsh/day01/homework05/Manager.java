package com.fsh.day01.homework05;

public class Manager extends Employee{
	private String section;
	
	
	public void show(){
		super.show();
		System.out.println("���ܲ��ţ�"+section);
	}
	
	public Manager(){
		super();
	}
	
	public Manager(String name, String address, int salary,String section) {
		super(name,address,salary);
		this.section = section;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	
}
