package com.urdomain.lecture.ch04;

public class Test {

	public static void main(String[] args) {

		int oddSum = 0, evenSum = 0;

        for(int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; ++j) {
                System.out.println(i + " X " + j + " = " + i * j);


                if ((i * j) % 2 == 0) {
                    evenSum += i * j;
                } 
                else {
                    oddSum += i * j;
                }
            }
            System.out.println();
        }
            System.out.println("홀수의 합 : " + oddSum);
            System.out.println("짝수의 합 : " + evenSum);
	}
}
	