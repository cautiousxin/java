package com.fsh.day01.homework01;

import java.util.Scanner;

/**
 * 1.需求：if示例,从键盘接收两个数字,再接收一个符号,然后进行运算
 * -------请输入第一个数字:8 
 * -------请输入第二个数字:9 
 * -------请输入运算符号:+ 
 * -------8+9=17
 */

public class IfDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt();
		System.out.println("请输入运算符号：");
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
				System.out.println("除数不能为0！");
				return;
			}else{
				c = a / b;
			}
		}
		
		System.out.println("运算结果c="+c);
	}
}
