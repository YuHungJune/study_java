package com.urdomain.lecture.ch05;

public class TestMultiArray {

	public static void main(String[] args) {
		
		String[][] array = new String[10][5];
		
		array[1][] = {"필독", "2022 대학별 추가합격 순위 결과! 과연 올해는?!", "편입의 신", "2022.02.14", "405"};
		array[1] = {"필독", "[편입 합격기념 초대박 이벤트]전원 5천원 증정+간식 대방출!", "편입의 신", "2022.01.28", "1497"};
		array[2] = {"공지", "편입 성적", "광탈러", "01:30", "152"};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
					
			}
		}
		
		
	}

}
