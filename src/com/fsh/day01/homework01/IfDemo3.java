package com.fsh.day01.homework01;

import java.util.Scanner;

public class IfDemo3 {

	/**
	 * 3.����Ӧ�����飺 �������У����170�������ϣ�20--26����
	 * Ů�����162�������ϣ�20---22����֮��
	 * �Ӽ��������Ա������Լ���ߣ��ж��Ƿ����Ӧ�����飡
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ա�");
		String sex = sc.next();
		System.out.println("���������䣺");
		int age = sc.nextInt();
		System.out.println("��������ߣ�");
		double height = sc.nextDouble();
		
		if(sex.equals("��")){
			if(age>=20&&age<=26&&height>170){
				System.out.println("�����Է������� ����������");
			}else{
				System.out.println("�����Բ��������������ܹ�����");
			}
		}else{
			if(age>=20&&age<=22&&height>162){
				System.out.println("��Ů�Է������� ����������");
			}else{
				System.out.println("��Ů�Բ��������������ܹ�����");
			}
		}
	}
}
