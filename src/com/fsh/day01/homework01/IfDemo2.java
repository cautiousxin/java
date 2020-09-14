package com.fsh.day01.homework01;

import java.util.Scanner;

/**
 * 2.需求：飞机票在淡季是有优惠政策的,而放假期间是没有优惠的， 
 * 假设在元旦三天（1.01---1.03），
 * 五一三天（5.01---5.03）， 
 * 十一七天（10.01---10.07）无任何优惠，
 * 除了以上13天，都打8折， 请输入您哪天订票，以及票价（自己设定一个吧），
 * 输出应付多少钱？
 */

public class IfDemo2 {
	public static void main(String[] args) {
		String s = "1.01-1.02-1.03-5.01-5.02-5.03-10.01-10.02-10.03-10.04-10.05-10.06-10.07";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入订票日期：");
		String date = sc.next();
		
		double price = 137;
		
		if(s.contains(date)){
			System.out.println("请支付"+price+"元");
		}else{
			System.out.println("请支付"+String.format("%.2f", price*0.8)+"元");
		}
	}
}
