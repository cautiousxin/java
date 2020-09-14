package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 
4.验证歌德巴赫猜想: 输入的是0，表示想退出输入；
对任何一个不小于6的偶数a，总可以表示成两个奇素数的和；a= x+y;
   8 = 3 + 5;
奇素数：奇数，素数：只能被1或者本身整除的数（质数）
 * @author fsh15
 *
 */
public class ForDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个偶数：");
		int num = sc.nextInt();
		while(num  != 0){
			if(num<6){
				System.out.println("不符合输入规则！");
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
	 * 判断是否为奇素数
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
