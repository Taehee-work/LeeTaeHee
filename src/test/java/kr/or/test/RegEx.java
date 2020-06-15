package kr.or.test;

import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp ="[a-zA-Z0-9][a-zA-Z0-9]{7,11}";
		//아이디는 [a-zA-Z0-9]는 a부터z까지,A부터Z까지,0부터9에서 시작할 수 있음
		//0부터 시작. 아이디 글자수 최소값 8부터 최대값 12까지
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("ID는 최소 8자부터 최대 12자까지, 영문 소문자, 숫자와 특수기호(_),(-)사용 가능합니다.");
		}
	}

}