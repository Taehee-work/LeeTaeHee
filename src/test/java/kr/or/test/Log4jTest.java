package kr.or.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;
//기술 참조: https://smujihoon.tistory.com/121
public class Log4jTest {
	
	private Logger log = Logger.getLogger(Log4jTest.class);
	
	public void test() {
		//org.edu.vo.MemberVO memberVO = new MemberVO(); 타 패키지 출력방법
		MemberVO memberVO = new MemberVO();
		memberVO.setName("홍길동");
		memberVO.setAge(24);
		//IP 주소 출력 : InetAddress 이용
		try {
			InetAddress localPc = InetAddress.getLocalHost();
			String ip = localPc.getHostAddress();
			log.info("test라는 메서드를 사용한 PC의 아이피는: " + ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//logger level: debug < info < warn < error < fatal순
		log.debug("debug임!!" + memberVO);
		log.info("Info임!!");
		log.warn("warn임!!");
		log.error("error임!!");
		log.fatal("fatal임!!");
		
	}
	public static void main(String[] args) {
		new Log4jTest().test();

	}

}
