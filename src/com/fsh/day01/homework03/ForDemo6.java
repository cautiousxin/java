package com.fsh.day01.homework03;
/**
 * 6.��50000���ڵ��걸����
		��ʾ���걸��--->����Լ��(����������)֮�͵����Լ���
		�磺6��Լ����1��2��3��1+2+3 = 6��
 * @author fsh15
 *
 */
public class ForDemo6 {
	public static void main(String[] args) {
		for(int i = 1;i<50001;i++){
			ForDemo6.isPerfectNum(i);
		}
	}
	
	public static void isPerfectNum(int num){
		int sum = 0;
		for(int i = 1;i<num;i++){
			if(num%i==0){
				sum +=i;
			}
		}
		
		if(sum == num){
			System.out.println(num);
		}
	}
}
