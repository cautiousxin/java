package com.fsh.day01.homework03;
/**
 * 3.³Ë·¨¿Ú¾÷±í£»£¨for£©
 * @author fsh15
 *
 */
public class ForDemo3 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for(int j = 1;j <= i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
