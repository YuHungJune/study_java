package com.urdomain.lecture.ch02;

public class VariableExample {

	public static void main(String[] args) {
		int value = 10;
		int result = value + 10;
		
		System.out.println(result);
		
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		Integer result1 = new Integer(i.intValue() + j.intValue());
		System.out.print(result1);
		
		a = 2;
		if(a == 1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb : " + bbb);
		}else {
			
		}
		//System.out.println("bbb : " + bbb); //error

	}

}
