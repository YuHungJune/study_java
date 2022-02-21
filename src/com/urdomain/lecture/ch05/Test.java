package com.urdomain.lecture.ch05;

public class Test {

	public static void main(String[] args) {
		
		int[] array1 = {2, 3, 4, 5, 6, 7, 8, 9};	// 2 ~ 9
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};	// 1 ~ 9
		
		
		for(int j = 0; j < array2.length; j++) {
			for(int i = 0; i < array1.length; i++) {

				System.out.print(array1[i] + " X " + array2[j] + " = " + array1[i]*array2[j] + '\t');
			}
			System.out.println();
		}
	}
}
