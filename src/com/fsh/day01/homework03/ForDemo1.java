package com.fsh.day01.homework03;

import java.util.Scanner;

/**
 * 1�������ֵ���Ϸ(GuessNumber)
	��Ϸ����ʱ����һ��1��100֮������������Ҫ���û��ӿ���̨�������֣�
	����������ֱȲ���������С�����������̫С�ˣ��ٴ�һ�㣡����
	����������ֱȲ��������ִ����������̫���ˣ���Сһ�㣡����
	����������ֺͲ�����������ȣ������������ϲ��¶��ˣ�����
	���û�����7�λ�δ�¶ԣ������������̫���ˣ��´������ɣ���Ȼ���˳�����
	   ��ʾ��
	   	(1)��int num=(int)(Math.random()*100); //java.lang.Math;
		  (2)��Scanner in=new Scanner(System.in); // java.util.Scanner;
	         int n = in.nextInt();
 * @author fsh15
 *
 */
public class ForDemo1 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int number = (int)(Math.random()*100+1);
		System.out.println("��������µ����֣�");
		int guessNum = sc.nextInt();
		int count = 1;//������
		
		for(int i = 0;i < 6;i++){
			if(guessNum > number){
				System.out.println("̫���ˣ���Сһ�㣡");
				System.out.println("���������룺");
				guessNum = sc.nextInt();
				count++;
			}else if(guessNum == number){
				System.out.println("��ϲ�¶��ˣ�");
				break;
				
			}else{
				System.out.println("̫С�ˣ��ڴ�һ�㣡");
				System.out.println("���������룺");
				guessNum = sc.nextInt();
				count++;
			}
		}
		if(count == 7){
			System.out.println("��̫���ˣ��´������ɣ�");
			System.out.println("��ȷ����ǣ�"+number);
		}
		
	}
}
