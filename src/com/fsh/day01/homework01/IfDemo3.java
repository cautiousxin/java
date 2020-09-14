package com.fsh.day01.homework01;

import java.util.Scanner;

public class IfDemo3 {

	/**
	 * 3.需求：应征入伍： 条件：男，身高170厘米以上，20--26周岁
	 * 女，身高162厘米以上，20---22周岁之间
	 * 从键盘输入性别，年龄以及身高，判断是否可以应征入伍！
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入性别：");
		String sex = sc.next();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入身高：");
		double height = sc.nextDouble();
		
		if(sex.equals("男")){
			if(age>=20&&age<=26&&height>170){
				System.out.println("该男性符合条件 ，可以入伍");
			}else{
				System.out.println("该男性不符合条件，不能够入伍");
			}
		}else{
			if(age>=20&&age<=22&&height>162){
				System.out.println("该女性符合条件 ，可以入伍");
			}else{
				System.out.println("该女性不符合条件，不能够入伍");
			}
		}
	}
}
