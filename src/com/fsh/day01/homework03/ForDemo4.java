package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 
4.��֤��°ͺղ���: �������0����ʾ���˳����룻
���κ�һ����С��6��ż��a���ܿ��Ա�ʾ�������������ĺͣ�a= x+y;
   8 = 3 + 5;
��������������������ֻ�ܱ�1���߱�������������������
 * @author fsh15
 *
 */
public class ForDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ż����");
		int num = sc.nextInt();
		while(num  != 0){
			if(num<6){
				System.out.println("�������������");
				break;
			}
			for(int i = 3;i<num/2;i++){
				if(ForDemo4.isPrime(i)){
					int a = i;
					int b = num -i;
					if(ForDemo4.isPrime(b)){
						if(a+b==num){
							System.out.println(num+"="+a+"+"+b);
						}
					}
					
				}
			}
			num = sc.nextInt();
		}
		
	}
	/**
	 * �ж��Ƿ�Ϊ������
	 * @param x
	 * @return
	 */
	public static boolean  isPrime(int x){
		if(x%2==0)return false;
		for(int i = 2;i < x;i++){
			if(x%i==0) return false;
		}
		return true;
	}
}
