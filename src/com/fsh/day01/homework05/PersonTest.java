package com.fsh.day01.homework05;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("张三", 25, true, null);
		Person p2 = new Person("李四",26,true,null);
		p1.marry(p2);
	}
}
