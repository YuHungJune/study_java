package com.urdomain.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
		for(int i = 1; i <= 6; i++) {
			
			switch(i) {
			case 1:
				num1 = (int)(Math.random()*(45 + 1));
				break;
			case 2:
				num2 = (int)(Math.random()*(45 + 1));
				break;
			case 3:
				num3 = (int)(Math.random()*(45 + 1));
				break;
			case 4:
				num4 = (int)(Math.random()*(45 + 1));
				break;
			case 5:
				num5 = (int)(Math.random()*(45 + 1));
				break;
			case 6:
				num6 = (int)(Math.random()*(45 + 1));
				break;
			default:
				break;
			}
			
			for(int j = 1; j <= i; j++) {
				int cn = 0;
				switch(j) {
				
				case 1:
					break;
				case 2:
					if(num2 == num1) {
						cn = 1;
						break;
					}
					else {}
					break;
				case 3:
					if(num3 == num1) {
						cn  = 1;
						break;
					}
					
					else if(num3 == num2) {
						cn = 1;
						break;
					}
					
					else {}
					break;
					
				case 4:
					if(num4 == num1) {
						cn = 1;
						break;
					}
					
					else if(num4 == num2) {
						cn = 1;
						break;
					}
					
					else if(num4 == num3) {
						cn = 1;
						break;
					}
						
					else {}
					break;
					
				case 5:
					if(num5 == num1) {
						cn = 1;
						break;
					}
					
					else if(num5 == num2) {
						cn = 1;
						break;
					}
						
					else if(num5 == num3) {
						cn = 1;
						break;
					}
						
					else if(num5 == num4) {
						cn = 1;
						break;
					}
						
					else {}
					break;
					
				case 6:
					if(num6 == num1) {
						cn = 1;
						break;
					}
					else if(num6 == num2) {
						cn = 1;
						break;
					}
					
					else if(num6 == num3) {
						cn = 1;
						break;
					}
						
					else if(num6 == num4) {
						cn = 1;
						break;
					}
						
					else if(num6 == num5) {
						cn = 1;
						break;
					}
					
					else {}
					break;
					
				}
				
				
				if(cn == 1) {
					j = (i+1);
					break;
				}
			}
		
		}
		System.out.println(num1 + ' ' + num2 + ' ' + num3 + ' ' + num4 + ' ' + num5 + ' ' + num6);
	}

}
