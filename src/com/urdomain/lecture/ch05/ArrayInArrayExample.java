package com.urdomain.lecture.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{99, 88}, {77, 66}, {55, 44, 77}};
		
		int[][] scores2 = new int[2][3];
		
		int[][] scores3 = new int[3][];
		scores3[0] = new int[2];
		scores3[1] = new int[2];
		scores3[2] = new int[2];
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("scores[2].length = " + scores[2].length);
		System.out.println("scores[0].length = " + scores[0].length);
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.println("scores[" + i + "][" + j + "] : " + scores[i][j] + " ");
			}
			System.out.println();
		}

	}

}
