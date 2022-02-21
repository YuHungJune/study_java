package com.urdomain.lecture.ch05;

public class ArrayCreateByNewExample {

	

	public static void main(String[] args) {
	
		double[] arr2 = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 1.0;
		arr2[1] = 2.0;
		arr2[2] = 3.0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr3[0] = "유형준";
		arr3[1] = "안혜진";
		arr3[2] = "정휘인";
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		

	}

}
