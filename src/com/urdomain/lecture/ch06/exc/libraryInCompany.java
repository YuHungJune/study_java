package com.urdomain.lecture.ch06.exc;
import java.util.Scanner;
import java.util.Date;
public class libraryInCompany {
	
	int bookNumber;		//책의 권수
	int outNum;			//빌려간 책의 권수
	String bookTitle;	//책 제목
	String bookAuthor;	//작가
	
	Date inDate;		//들어올 날짜
	Date outDate;		//나간 날짜
	int releaseDate;	//대출 날짜
	
	String location;	//책의 위치
	public void bookSearch(String bookTitle, String bookAuthor, int bookNumber, int location ) {		//책의 여부 및 위치
		
		
	}
	
	public int bookBorrow(String bookTitle, int bookNumber, Date outDate, Date inDate, int releaseDate) {
		
	
		
		return bookNumber;
	}
	
	public int bookReturn(String bookTitle, int bookNumber, int releaseDate, Date inDate, Date outDate) {
		
		return bookNumber;
	}

}
