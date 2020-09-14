package com.fsh.day01.homework04;

/*
* 2.封装一个皇帝类，里面有姓名，在位时间，政绩，描述4个属性，
* 提供一个方法用来显示所有属性，私有化这些属性并提供对应的get以及set方法，
* 并在测试类中测试。
*/
public class Emperor {
	private String name;
	private int years;
	private String achievements;
	private String description;
	
	public Emperor(){
		
	}
	
	public Emperor(String name, int years, String achievements, String description) {
		super();
		this.name = name;
		this.years = years;
		this.achievements = achievements;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void show(){
		System.out.println("name:"+name+"\n"+"years:"+years+"\n"+"achievements:"+achievements+"\n"+"description:"+description+"\n");
	}
}
