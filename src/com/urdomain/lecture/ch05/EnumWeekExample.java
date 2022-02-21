package com.urdomain.lecture.ch05;
import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week abc = Week.MONDAY;
		Week def = Week.SUNDAY;
		
		System.out.println(abc);
		System.out.println(def);
		
		Week today = null;	//데이터 타입 : Week
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.THURSDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SATURDAY)
			System.out.println("일요일에는 축구를 합니다");
		else if(today == Week.MONDAY)
			System.out.println("열심히 자바 공부합니다.");
		else if(today == Week.TUESDAY)
			System.out.println("열심히 자바 공부합니다.");
		else if(today == Week.WEDNESDAY)
			System.out.println("열심히 자바 공부합니다.");
		else if(today == Week.THURSDAY)
			System.out.println("열심히 자바 공부합니다.");
		else if(today == Week.FRIDAY)
			System.out.println("열심히 자바 공부합니다.");
		else
			System.out.println("열심히 자바 공부합니다.");
		

	}

}
