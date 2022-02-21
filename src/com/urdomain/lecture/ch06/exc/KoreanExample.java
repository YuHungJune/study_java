package com.urdomain.lecture.ch06.exc;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean korean = new Korean();
		
		System.out.println("Korean nation : " + korean.nation);
		System.out.println("Korean name : " + korean.name);
		System.out.println("Korean ssn : " + korean.ssn);
		
		korean.name = "유형준";
		korean.ssn = "123456";
		
		
		System.out.println(" -------------------------- ");
		System.out.println("Korean nation : " + korean.nation);
		System.out.println("Korean name : " + korean.name);
		System.out.println("Korean ssn : " + korean.ssn);
		
		Korean korean2 = new Korean("전지현", "123451234");
		System.out.println(" -------------------------- ");
		System.out.println("Korean2 nation : " + korean2.nation);
		System.out.println("Korean2 name : " + korean2.name);
		System.out.println("Korean2 ssn : " + korean2.ssn);
		
		
		
	}

}
