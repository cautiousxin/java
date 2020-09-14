package com.fsh.day01.homework05;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("张三", "淮北", 1800);
		e.show();
		System.out.println("-------------");
		Manager m = new Manager("李四","合肥",9000,"java部");
		m.show();
		System.out.println("-------------");
		Director d = new Director("王五","滁州",12000,800);
		d.show();
	}
}
