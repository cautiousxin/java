package com.fsh.day01.homework01;

import java.util.Scanner;

/**
 * 1.����ifʾ��,�Ӽ��̽�����������,�ٽ���һ������,Ȼ���������
 * -------�������һ������:8 
 * -------������ڶ�������:9 
 * -------�������������:+ 
 * -------8+9=17
 */

public class IfDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		System.out.println("������������ţ�");
		String op = sc.next();
		int c = 0;
		
		if(op.equals("+")){
			c = a + b;
		}else if(op.equals("-")){
			c = a - b;
		}else if(op.equals("*")){
			c = a*b;
		}else if(op.equals("/")){
			if(b==0){
				System.out.println("��������Ϊ0��");
				return;
			}else{
				c = a / b;
			}
		}
		
		System.out.println("������c="+c);
	}
}
