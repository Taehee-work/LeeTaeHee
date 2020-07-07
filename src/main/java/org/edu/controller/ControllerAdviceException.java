
package org.edu.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerAdviceException {
	private static final Logger logger = LoggerFactory.getLogger(ControllerAdviceException.class);
	@ExceptionHandler(Exception.class)
	public ModelAndView errorModeAneView(Exception ex, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		//'ModelAndView'에서 'setViewName'은 jsp 파일명과 매칭 
		modelAndView.setViewName("admin/error_controller");//.jsp와 매칭하기위해서(생략가능)
		modelAndView.addObject("exception", ex);
		
		//에러 발생시 이전페이지 URL을 session변수를 이용해서 jsp로 보내는 코딩
		String referer = request.getHeader("Referer");
		//에러 이전 페이지의 Referrer값을 변수로 저장한 String referrer를
		//세션으로 저장해서 jsp페이지에 prevPage변수로 보낸는 작업(아래코드)
		request.getSession().setAttribute("prevPage", referer);
		//세션 변수의 출현배경(아래)
		//브라우저는 stateless(상태보존없음) 기반이기때문에
		//링크 이동시 이전페이지의 저장 값이 이동한 페이지에서 사라지기 때문에 stateless라고 함
		//stateless 상태에서 계속 값을 유지하려면, 세션변수를 사용하게 된다
		return modelAndView;
		
	}

}
