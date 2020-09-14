package com.fsh.day01.homework03;
/**
 * 6.求50000以内的完备数；
		提示：完备数--->它的约数(除了它本身)之和等于自己；
		如：6的约数有1，2，3，1+2+3 = 6；
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
