package com.urdomain.lecture.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[5];
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		System.arraycopy(arr1,  0, arr2, 0, arr1.length);
		
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
