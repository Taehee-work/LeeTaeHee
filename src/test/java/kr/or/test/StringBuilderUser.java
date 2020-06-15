package kr.or.test;

public class StringBuilderUser {
	public static void main(String[] args) {
		String str = "";
		for(int cnt = 1; cnt<=100; cnt++) {
			str += cnt;
		}
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		for(int cnt=1; cnt<=100; cnt++) {
			sb.append(cnt);
		}
		str = sb.toString();
		System.out.println(str);
	}
}
