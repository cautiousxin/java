package com.fsh.day01.homework04;

/*
* 2.��װһ���ʵ��࣬��������������λʱ�䣬����������4�����ԣ�
* �ṩһ������������ʾ�������ԣ�˽�л���Щ���Բ��ṩ��Ӧ��get�Լ�set������
* ���ڲ������в��ԡ�
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
