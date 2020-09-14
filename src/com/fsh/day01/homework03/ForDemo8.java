package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 8.1 1 2 3 5 8 13 21 34 55 ... 
 * @author fsh15
 *
 */
public class ForDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入所求数值的个数");
		int n = sc.nextInt();
		int f0 = 1;
		int f1 = 1;
		int f2 = 2;
		System.out.print(f0+"\t");
		System.out.print(f1+"\t");
		System.out.print(f2+"\t");
		
		for(int i = 3;i<n;i++){
			f0 = f1;
			f1 = f2;
			f2 = f1+f0;
			System.out.print(f2+"\t");
			
		}
	}
}
