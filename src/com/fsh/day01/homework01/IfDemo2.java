package com.fsh.day01.homework01;

import java.util.Scanner;

/**
 * 2.���󣺷ɻ�Ʊ�ڵ��������Ż����ߵ�,���ż��ڼ���û���Żݵģ� 
 * ������Ԫ�����죨1.01---1.03����
 * ��һ���죨5.01---5.03���� 
 * ʮһ���죨10.01---10.07�����κ��Żݣ�
 * ��������13�죬����8�ۣ� �����������충Ʊ���Լ�Ʊ�ۣ��Լ��趨һ���ɣ���
 * ���Ӧ������Ǯ��
 */

public class IfDemo2 {
	public static void main(String[] args) {
		String s = "1.01-1.02-1.03-5.01-5.02-5.03-10.01-10.02-10.03-10.04-10.05-10.06-10.07";
		Scanner sc = new Scanner(System.in);
		System.out.println("�����붩Ʊ���ڣ�");
		String date = sc.next();
		
		double price = 137;
		
		if(s.contains(date)){
			System.out.println("��֧��"+price+"Ԫ");
		}else{
			System.out.println("��֧��"+String.format("%.2f", price*0.8)+"Ԫ");
		}
	}
}
