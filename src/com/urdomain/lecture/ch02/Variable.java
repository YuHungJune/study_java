package com.urdomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
		
		//변수 명명법
		//첫 글자 소문자 그리고 다음 문자열부터는 대문자
		//모든 변수명은 붙여서 사용
		//대소문자 구분함
		String fuulName = "Yoo HyungJune";
		String name = "HyungJune";
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("roomNumber : " + roomNumber);
		System.out.println("roomnumber : " + roomnumber);
		
		
		boolean defaultNy2 = true;
		
		

		
		boolean defaultNy = false;
		int a = 0;
		
		int b = 1;
		int c = 0;
		c = a + b;
		
		boolean defaultNy1 = false;
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		float ee = 0.0f;
		double ff = 0.0;
		
		char gg = ' ';
		String hh = "";
		//리터럴 = 데이터다
		//ex) 정수형리터럴 = 정수형데이터
		
		System.out.println(c);
		System.out.println("HyungJune");
		System.out.println("HyungJune : " + c + "warm!!");
		System.out.println("\t한 칸 들여쓰기");
		
		
		System.out.println("한 줄 바꿈1");
		System.out.println("\n한 줄 바꿈");
		
		System.out.println("한 줄 바꿈2");
		System.out.println("\r한줄바꿈");
		
		System.out.println("\'");
		System.out.println("\"");
		System.out.println("\\");
		
		System.out.println("\'나는 생각한다\'");
		System.out.println("데카르트가 말했다.\"나는 존재한다.\"");
		System.out.println("\\");		
	}

}
