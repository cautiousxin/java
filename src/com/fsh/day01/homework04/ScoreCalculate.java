package com.fsh.day01.homework04;

/*
 * 1.该实例为定义一个成绩计算类。
类中包含的内容有：
  1、三个float类型的成员属性（Java成绩、C#成绩、数据库成绩）；
  2、对三个私有属性的公开的getter/setter方法；
  3、一个无参的构造方法和一个带参数的构造方法；
  4、计算三个科目的平均值的方法；
  5、计算三个科目的总成绩的方法；
  6、程序入口main方法。

在main中分别通过有参和无参的构造方法实例化成绩计算类的对象实体并传入成绩参数。
再通过对象调用计算平均值和总成绩的方法打印输出。
在计算平均值和总成绩的方法中，分别获取到属性的值进行计算。
 */
public class ScoreCalculate {
	private float scoreJava;
	private float scoreCsharp;
	private float scoreSql;
	
	public ScoreCalculate(float scoreJava, float scoreCsharp, float scoreSql) {
		super();
		this.scoreJava = scoreJava;
		this.scoreCsharp = scoreCsharp;
		this.scoreSql = scoreSql;
	}
	
	public ScoreCalculate(){
		
	}
	
	public float getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(float scoreJava) {
		this.scoreJava = scoreJava;
	}
	public float getScoreCsharp() {
		return scoreCsharp;
	}
	public void setScoreCsharp(float scoreCsharp) {
		this.scoreCsharp = scoreCsharp;
	}
	public float getScoreSql() {
		return scoreSql;
	}
	public void setScoreSql(float scoreSql) {
		this.scoreSql = scoreSql;
	}
	
	public void avgScore(){
		float avgSc = (scoreCsharp+scoreJava+scoreSql)/3;
		System.out.println("该学生的平均分数是："+String.format("%.2f", avgSc));
	}
	
	public void totalScore(){
		float total = scoreCsharp+scoreJava+scoreSql;
		System.out.println("该学生的总分数是："+String.format("%.2f", total));
	}
	
	public static void main(String[] args) {
		ScoreCalculate sc = new ScoreCalculate(89,95,88);
		sc.avgScore();
		sc.totalScore();
	}
	
}
