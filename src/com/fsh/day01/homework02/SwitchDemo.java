package com.fsh.day01.homework02;

import java.util.Scanner;

/**
 * 1.����ѧԱ�Ŀ��Գɼ��������ѧԱ���Գɼ��ļ���
 *	100      A��
 *	90~99    A��
 *	80~89    B��
 *  70~79    C��
 *  60~69    D��
 *	< 60     ���ϸ�
 * @author fsh15
 *
 */
public class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("������ѧԱ�ĳɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		int level = score/10;
		
		switch (level) {
		case 10:
			System.out.println("ѧԱ�ɼ�ΪA��");
			break;
		case 9:
			System.out.println("ѧԱ�ɼ�ΪA��");
			break;
		case 8:
			System.out.println("ѧԱ�ɼ�ΪB��");
			break;
		case 7:
			System.out.println("ѧԱ�ɼ�ΪC��");
			break;
		case 6:
			System.out.println("ѧԱ�ɼ�ΪD��");
			break;

		default:System.out.println("��ѧԱ�ɼ����ϸ�");
			break;
		}
		
	}
}
