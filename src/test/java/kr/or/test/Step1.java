package kr.or.test;

public class Step1 {

	public static void main(String[] args) {
		System.out.println("내장변수 자료형 소스");
		//필드 field = 변수
		String name;
		int age;
		String phoneNum;//카멜표기법
		
		name = "스랄";
		age = 45;
		phoneNum = "000-0000-0000";
		printMember(name, age, phoneNum);
		
		name = "실바나스";
		age = 100;
		phoneNum = "111-1111-1111";
		printMember(name, age, phoneNum);
		
		name = "가로쉬";
		age = 3;
		phoneNum = "222-2222-2222";
		printMember(name, age, phoneNum);//메서드의 매개변수(인자,파라미터)로 값을 전달
		
		System.out.println("내장변수 배열자료형 소스");
		String[]names = {"스랄", "실바나스", "가로쉬"};//[]는 배열
		int[] ages = {45,100,3};
		String[] phoneNums = {"000-0000-0000","111-1111-1111","222-2222-2222"};
		printMember(names,ages,phoneNums);//오버로드 - 같은 이름의 매개변수가 틀린 메서드
	}

	private static void printMember(String name, int age, String phoneNum) {
		System.out.println("이름은: " + name + " | 나이는: " + age + " | 전화번호는: " + phoneNum);
	}
	
	private static void printMember(String[] names, int[] ages, String[] phoneNums) {
		int cntLength = names.length;
		System.out.println("매개변수 이름의 갯수는 " + cntLength + " 입니다.");
		for(int cnt = 0;cnt<cntLength; cnt++) {//배열을 값을 참조할때 주소(index)를 사용하는데, 0번째 주소부터 시작
		System.out.println("이름은: " + names[cnt] + " | 나이는: " + ages[cnt] + " | 전화번호는: " + phoneNums[cnt]);
		}
	}
	
}
