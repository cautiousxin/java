package com.fsh.day01.homework05;
/**
 * 1.дһ����Person,�����������ԣ�
	String  name;
	int  age; 
	boolean  gender;  //�Ա�  true��  falseŮ
	Person  partner;  //����
  ΪPerson��дһ��marry(Person  p)����������ǰ�����p��飬�������Խ�飬�����������Ϣ��
  ����������ܽ��ԭ��Ҫ��������һ������дһ�������������������ϳ���
 ������������ܽ�飺1��ͬ�ԣ�2��δ�ﵽ������䣬��<24��Ů<22��3��ĳһ���ѻ飩
 */
 
public class Person {
	private String name;
	private int age;
	private boolean gender;
	private Person partner;
	
	public void marry(Person p){
		if(p.partner!=null||this.partner!=null){
			System.out.println("��һ���Ѿ����");
		}else if(p.isGender()==this.isGender()){
			System.out.println("ͬ�Բ������");
		}else if(p.isGender()==false){
			if(p.getAge()<22||this.getAge()<24){
				System.out.println("���䲻��");
			}else{
				System.out.println("ף����ú�");
			}
		}else if(p.isGender()==true){
				if(p.getAge()<24||this.getAge()<22){
					System.out.println("���䲻��");
				}else{
					System.out.println("ף����ú�");
				}
			}
	}
	
	public Person(){
		
	}
	
	public Person(String name, int age, boolean gender, Person partner) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Person getPartner() {
		return partner;
	}
	public void setPartner(Person partner) {
		this.partner = partner;
	}
	
	
}
