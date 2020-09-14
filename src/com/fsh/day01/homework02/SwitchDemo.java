package com.fsh.day01.homework02;

import java.util.Scanner;

/**
 * 1.输入学员的考试成绩，输出这学员考试成绩的级别。
 *	100      A级
 *	90~99    A级
 *	80~89    B级
 *  70~79    C级
 *  60~69    D级
 *	< 60     不合格
 * @author fsh15
 *
 */
public class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("请输入学员的成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		int level = score/10;
		
		switch (level) {
		case 10:
			System.out.println("学员成绩为A级");
			break;
		case 9:
			System.out.println("学员成绩为A级");
			break;
		case 8:
			System.out.println("学员成绩为B级");
			break;
		case 7:
			System.out.println("学员成绩为C级");
			break;
		case 6:
			System.out.println("学员成绩为D级");
			break;

		default:System.out.println("该学员成绩不合格");
			break;
		}
		
	}
}
