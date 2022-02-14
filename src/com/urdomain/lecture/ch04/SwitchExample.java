package com.urdomain.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		//double num = Math.random();
		
		int num = 0;
		for(int i = 0; i < 1000; ++i) {
			num = (int)(Math.random()*7) + 1;
			System.out.println(num);
		}
		
		

	}

}
