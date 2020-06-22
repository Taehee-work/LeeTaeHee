package kr.or.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class OpenApi {
	
	public static void serviceApi() {
		//외부연계 메서드
		/* 입력된 데이터가 바로 전달되지 않고 중간에 버퍼링이 된 후에 전달되됩니다. 
		 * 출력도 마찬가지로 버퍼를 거쳐서 간접적으로 출력장치로 전달되기에 시스템의 
		 * 데이터처리 효율성을 높여주며 버퍼스트림을
		 * InputStreamReader / OutputStreamWriter를 같이 사용하여 
		 * 버퍼링을 하게 되면 입출력 스트림으로부터 미리 버퍼에 데이터를 갖다 놓기 때문에 
		 * 보다 효율적인 입출력이 가능합니다.*/
		BufferedReader br = null;//HRD-net에서 전송받은 데이터를 일시 저장하는 곳
		String urlstr = "http://www.hrd.go.kr/jsp/HRDP/HRDPO00/HRDPOA60/HRDPOA60_1.jsp"
				+ "?returnType=XML&authKey=인증키부분&pageNum="
				+ "1&pageSize=10&srchTraStDt=20200622&srchTraEndDt=20200922&outType="
				+ "1&sort=ASC&sortCol=TR_STT_DT";
		try {
			URL url = new URL(urlstr);
			HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
			urlconnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"euc-kr"));
			String result ="";
			String line;
			while((line = br.readLine())!=null) {
				result = result + line + "\n";
				//1부터 100까지 더하는 로직과 같음
			}
			//System.out.println(result);
			String result_xmlUils = XmlUtils.formatXml(result.toString());
			System.out.println(result_xmlUils);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//콘솔 화면에 현재 PC시간을 표시
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
	}
	
	//메인start메서드
	//연계주기(반복실행) 소스
	public static void main(String[] args) {
		//실행간격 지정(5초)
		int sleepSec = 5;
		
		//주기적인 작업을 위한 코딩-exec 실행가능한 클래스를 만듬
		final ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
		exec.scheduleAtFixedRate(new Runnable() {
			public void run() {
				serviceApi();
			}
		},0,sleepSec,TimeUnit.SECONDS);
		serviceApi();
	} 
}
