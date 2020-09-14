package com.fsh.day01.homework04;

/*
 * 1.��ʵ��Ϊ����һ���ɼ������ࡣ
���а����������У�
  1������float���͵ĳ�Ա���ԣ�Java�ɼ���C#�ɼ������ݿ�ɼ�����
  2��������˽�����ԵĹ�����getter/setter������
  3��һ���޲εĹ��췽����һ���������Ĺ��췽����
  4������������Ŀ��ƽ��ֵ�ķ�����
  5������������Ŀ���ܳɼ��ķ�����
  6���������main������

��main�зֱ�ͨ���вκ��޲εĹ��췽��ʵ�����ɼ�������Ķ���ʵ�岢����ɼ�������
��ͨ��������ü���ƽ��ֵ���ܳɼ��ķ�����ӡ�����
�ڼ���ƽ��ֵ���ܳɼ��ķ����У��ֱ��ȡ�����Ե�ֵ���м��㡣
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
		System.out.println("��ѧ����ƽ�������ǣ�"+String.format("%.2f", avgSc));
	}
	
	public void totalScore(){
		float total = scoreCsharp+scoreJava+scoreSql;
		System.out.println("��ѧ�����ܷ����ǣ�"+String.format("%.2f", total));
	}
	
	public static void main(String[] args) {
		ScoreCalculate sc = new ScoreCalculate(89,95,88);
		sc.avgScore();
		sc.totalScore();
	}
	
}
