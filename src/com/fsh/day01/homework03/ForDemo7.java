package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 7.求3.1415926...=(1-1/3+1/5-1/7+1/9。。。)*4
 * @author fsh15
 *
 */
public class ForDemo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入n(控制表达式中数的个数):");
		int n = sc.nextInt();
		double sum = 0.0;
		for(int i = 0;i <= n;i++){
			if(i%2==0){
				sum = sum + (double)(1.0/(2*i+1));
			}
			if(i%2==1){
				sum = sum - (double)(1.0/(2*i+1));
			}
		}
		
		double pi = sum*4.0;
		System.out.println("pi="+String.format("%.5f", pi));
	}
}
