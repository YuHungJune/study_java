package com.urdomain.lecture.ch05;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		Week today = Week.SUNDAY;
		System.out.println(today);	//데이터 타입. Week enum
		
	    String name = today.name();
		System.out.println(name);	//데이터 타입. String
		
		//ordinal() 메소드
		int ordinal = today.ordinal();	
		System.out.println(ordinal);
		
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);	
		//Week에서 day1이 day2에 보다 -2번재 자리 위치
		int result2 = day2.compareTo(day1);
		//Week에서 day1이 day2에 보다 2번재 자리 위치
		
		System.out.println(result1);
		System.out.println(result2);

		//valueOf() 메소드
		Week weekDay = Week.valueOf("SUNDAY	");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");
		}
		
		/*
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}
		*/
		
		//values() 메소드
		Week[] days = Week.values();
		System.out.println();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
