package kr.or.test;

import java.util.Scanner;

class Tire01{
	public void run() {//메서드 = 함수 = function()
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class SnowTire01 extends Tire01{ //상속 = extends =>부모
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}

public class Hello {
	public static void main(String[] args) {
/*		String name = "123"; //문자열형
		char var3 = 'a'; //단일분자형
		int num_name = Integer.parseInt(name); //변수형 변환
		System.out.println(num_name + "님 안녕하세요. 자바!");
		
		int score = 85;
		String result;
//		result = (!(score>90))?"가":"나";//삼항조건연산자 -?-:-
		if(!(score>90)) {
			result = "가";
		}else {
			result = "나";
		}
		System.out.println("조건에 맞는 답은 " + result + " 입니다.");
		
		int x = 10;
		int y = 5;
		boolean result1, result2, result3;//boolean형 변수지정
		//true = 1, false = 0;
		result1 = (x>7)&&(y<=5);//비교구문 and = && = *
		result2 = (x<7)&&(y<=5);
		result3 = (x<7)||(y<=5);//or = || = +
		
		System.out.println("1번:" + result1 + "/2번:" + result2 + "/3번:" + result3);
		System.out.println((x>7)&&(y<=5));//true
		System.out.println((x<7)&&(y<=5));//false
		System.out.println((x<7)||(y<=5));//true 
		
		int sum = 0;
		int cnt = 1;
		for(cnt=1; cnt<=100; cnt++) {//[cnt =cnt+1]=cnt++
			sum = sum + cnt;//sum은 누적변수, cnt는 증가변수
		}
		while(cnt<=100) {
			sum = sum + cnt;
			cnt = cnt + 1; //cnt++;
		}
		System.out.println("1부터 " + (cnt-1) + "까지의 합은 " + sum + " 입니다.");
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);//입출력정의 - 키보드입력
		while(run) {
			//~ln = new line = 엔터
			System.out.println("----------------------");
			System.out.println("1.입금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("위 번호를 입력해 주세요:");
			int menuNum = scanner.nextInt();//키보드로 입력받은 숫자를 초기값으로 지정
			if(menuNum==1) {
				System.out.print("입금액을 입력하세요:");
				balance = balance + scanner.nextInt();//입금액 키보드 입력
			}
			if(menuNum==2) {
				System.out.print("출금액을 입력하세요:");
				balance = balance - scanner.nextInt();
			}
			if(menuNum==3) {
				System.out.println("잔액은 " + balance + " 원 입니다.");
			}
			if(menuNum==4) {
				System.out.print("프로그램을 종료되었습니다.");
				run = false;
				//break; //while문을 빠져나가는 명령
			}
			switch(menuNum) {
			case 1:
				System.out.print("입금액을 입력하세요:");
				balance = balance + scanner.nextInt();//입금액 키보드 입력
				break;
			case 2:
				System.out.print("출금액을 입력하세요:");
				balance = balance - scanner.nextInt();
				break;
			case 3:
				System.out.println("잔액은 " + balance + " 원 입니다.");
				break;
			case 4:
				System.out.print("프로그램을 종료되었습니다.");
				run = false;//while문을 빠져나가는 명령
				break; //switch문을 빠져나가는 명령
			}
		}// end while문 */
		//SnowTire클래스형 변수 snowTire 생성
		//new키워드로 SnowTire()메서드를 이용해서 snowTire인스턴스클래스(메모리 공간 할당) 실행된상태[아래]
		SnowTire01 snowTire = new SnowTire01();
		Tire01 tire01 = snowTire;
		tire01.run();
		Tire01 tire02 = new Tire01();
		tire02.run();
	}
}
