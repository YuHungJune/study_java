package com.urdomain.lecture.ch04;

public class SwitchStringEx {

	public static void main(String[] args) {
		
			String position = "대리";
			
			switch(position) {
			
			case "사원":
				System.out.println("월급 300만원");
				break;
			case "대리":
				System.out.println("월급 400만원");
				break;
			case "과장":
				System.out.println("월급 500만원");
				break;
			case "부장":
				System.out.println("월급 600만원");
				break;
			default:
				System.out.println("기본우급적용");
				break;
			}

	}

}
