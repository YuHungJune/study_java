package com.urdomain.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		strArray[0] = "유형준";
		strArray[1] = "정휘인";
		strArray[2] = new String("안혜진");
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		
		System.out.println(strArray[0].equals(strArray[1]));
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
