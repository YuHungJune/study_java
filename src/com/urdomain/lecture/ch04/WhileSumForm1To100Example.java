package com.urdomain.lecture.ch04;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		
		while(i < 100) {
			
			a = (int)(Math.random()*45+1);
			
			System.out.println(a);
		}
		

	}

}
