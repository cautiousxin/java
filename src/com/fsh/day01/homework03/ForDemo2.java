package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 2.����Ļ�ϴ�ӡ��n�еĽ�����ͼ�����磬��n=5,��ͼ�����£�
        *
       ***
      *****
     *******
    *********
��չ����ӡ���
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
		System.out.println("�������ӡ������");
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
		System.out.println("�������ӡ������");
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



