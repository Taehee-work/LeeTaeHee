package kr.or.test;

import java.util.Calendar;

public class Step3 {

	public static void main(String[] args) {
		System.out.println("외부 라이브러리를 사용한 열거형 자료형 소스");
		//열거형 클래스 = 'enum'클래스
		Weeks today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Weeks.일; break;
		case 2:
			today = Weeks.월; break;
		case 3:
			today = Weeks.화; break;
		case 4:
			today = Weeks.수; break;
		case 5:
			today = Weeks.목; break;
		case 6:
			today = Weeks.금; break;
		case 7:
			today = Weeks.토; break;			
		}
		System.out.println("오늘은:" + today + "요일 입니다.");
		
		if(today==Weeks.월) {
			System.out.println("월요일에는 활기가 넘칩니다.");
		}else{
			System.out.println("열심히 자바 공부를 합시다.");	
			}
	}
}
