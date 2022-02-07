package com.urdomain.lecture.ch02;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		System.out.println("byteValue : " + byteValue);

		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		char charValue = '가';
		System.out.println("charValue : " + charValue);

		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);

	}

}
