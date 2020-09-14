package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 2.在屏幕上打印出n行的金字塔图案，如，若n=5,则图案如下：
        *
       ***
      *****
     *******
    *********
拓展：打印输出
		A
	   BBB
	  CCCCC
	 DDDDDDD
	EEEEEEEEE
 * @author fsh15
 *
 */
public class ForDemo2 {
	public static void main(String[] args) {
		ForDemo2 fd = new ForDemo2();
		fd.printStar();
		System.out.println("---------------");
		fd.printLetter();
		
	}
	
	public void printStar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入打印行数：");
		int n = sc.nextInt();
		for(int i = 0;i < n;i++){
			
			for(int j = n-i-1;j>0;j--){
				System.out.print(" ");
			}
			for(int k = 0;k<(2*i+1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printLetter(){
		char c = 'A';
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入打印行数：");
		int n = sc.nextInt();
		for(int i = 0;i < n;i++){
			
			for(int j = n-i-1;j>0;j--){
				System.out.print(" ");
			}
			for(int k = 0;k<(2*i+1);k++){
				System.out.print(c);
			}
			System.out.println();
			c+=1;
		}
	}
}



