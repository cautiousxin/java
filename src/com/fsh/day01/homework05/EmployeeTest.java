package com.fsh.day01.homework05;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("����", "����", 1800);
		e.show();
		System.out.println("-------------");
		Manager m = new Manager("����","�Ϸ�",9000,"java��");
		m.show();
		System.out.println("-------------");
		Director d = new Director("����","����",12000,800);
		d.show();
	}
}
