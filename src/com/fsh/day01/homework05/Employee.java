package com.fsh.day01.homework05;
/**
 *  
2.����Ա��Employee�࣬����������ַ�������������ԣ�
������;�������������ԣ��������н�ͨ�����������������ܲ��ţ�
�������ж�����ʾ�������Ϣ�ķ���show������ʵ�ַ�ʽ��ͬ��
��д�����๹�췽���������Ե�get��set������
��Ҫ�õ�this��super�ؼ��֡�
 * @author fsh15
 *
 */
public class Employee {
	private String name;
	private String address;
	private int salary;
	
	public void show(){
		//System.out.println("Ա����Ϣ���£�");
		System.out.println("������" + this.name);
		System.out.println("��ַ��" + this.address);
		System.out.println("�������ʣ�" + this.salary);
	}
	
	public Employee(){
		
	}
	
	public Employee(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
