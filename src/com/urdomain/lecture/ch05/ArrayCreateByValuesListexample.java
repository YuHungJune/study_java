package com.urdomain.lecture.ch05;

public class ArrayCreateByValuesListexample {

	public static void main(String[] args) {
		int[] score;	//선언
		
		int score2[];	//선언
		
		int[] score3 = {1, 2, 3, 4, 5, 6, 7, 8, 10};	//객체 생성
		
		int score4[] = {4, 5, 6};	//객체 생성
		
		double[] score6 = {1, 2, 3, 4};
		
		String[] strArray = {"유형준", "안헤진", "정휘인"};
		
		
		int[] score7 = {83, 90, 87, 99};
		
		System.out.println("score7[0] : " + score7[0]);
		System.out.println("score7[1] : " + score7[1]);
		System.out.println("score7[2] : " + score7[2]);
		
		int sum = 0;
		for(int i = 0; i < score7.length; i++) {
			sum += score7[i];
		}
		
		System.out.println("총합은 : " + sum);
		
		System.out.println("평균은 : " +  (double)sum/score7.length);	

		
		 

	}

}
