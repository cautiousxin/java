package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 1、猜数字的游戏(GuessNumber)
	游戏运行时产生一个1－100之间的随机整数，要求用户从控制台输入数字，
	若输入的数字比产生的数字小，则输出：“太小了，再大一点！”；
	若输入的数字比产生的数字大，则输出：“太大了，再小一点！”，
	若输入的数字和产生的数字相等，则输出：“恭喜你猜对了！”，
	若用户猜了7次还未猜对，则输出：“你太笨了，下次再来吧！”然后退出程序。
	   提示：
	   	(1)、int num=(int)(Math.random()*100); //java.lang.Math;
		  (2)、Scanner in=new Scanner(System.in); // java.util.Scanner;
	         int n = in.nextInt();
 * @author fsh15
 *
 */
public class ForDemo1 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int number = (int)(Math.random()*100+1);
		System.out.println("请输入你猜的数字：");
		int guessNum = sc.nextInt();
		int count = 1;//计数器
		
		for(int i = 0;i < 6;i++){
			if(guessNum > number){
				System.out.println("太大了，在小一点！");
				System.out.println("请重新输入：");
				guessNum = sc.nextInt();
				count++;
			}else if(guessNum == number){
				System.out.println("恭喜猜对了！");
				break;
				
			}else{
				System.out.println("太小了，在大一点！");
				System.out.println("请重新输入：");
				guessNum = sc.nextInt();
				count++;
			}
		}
		if(count == 7){
			System.out.println("你太笨了，下次再来吧！");
			System.out.println("正确结果是："+number);
		}
		
	}
}
