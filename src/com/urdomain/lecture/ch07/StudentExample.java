package com.urdomain.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {
	
		Student student = new Student("유형준", "1234-1234", 31);

		System.out.println("student.name = " + student.name);
		System.out.println("student.ssn = " + student.ssn);
		System.out.println("student.studentNo = " + student.studentNo);
	
		Student student2 = new Student("bathory", "1234");
		System.out.println("student.name = " + student2.name);
		System.out.println("student.ssn = " + student2.ssn);
		System.out.println("student.studentNo = " + student2.studentNo);
	}

}
