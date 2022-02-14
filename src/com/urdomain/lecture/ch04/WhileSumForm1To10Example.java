package com.urdomain.lecture.ch04;

public class WhileSumForm1To10Example {

	public static void main(String[] args) {
		int i = 1;
		int sum  = 0;
		
		while(i < 11) {
			System.out.println(i);
			sum += (i++);
		}

		System.out.println("1 ~ "+ (--i) + " 합 : " + sum);
	}

}
