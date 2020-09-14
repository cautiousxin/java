package com.fsh.day01.homework04;

public class TestEmperor {
	public static void main(String[] args) {
		Emperor em1 = new Emperor();
		em1.setName("康熙");
		em1.setYears(61);
		em1.setAchievements("政治上中央集权");
		em1.setDescription("清军入关后第二位皇帝");
		
		em1.show();
	}
}
