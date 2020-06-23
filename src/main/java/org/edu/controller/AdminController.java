package org.edu.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	/* 관리자 홈 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminHome(Locale locale, Model model) {
		/* Locale - 나라/지역 마다 다르게 표시되는 '언어','숫자 형식','날짜/시간 형식',
		 * '시간대','일광절약시간(DST)','통화 형식','문자 인코딩' 등의 차이를 
		 * 설명해주는 매개변수들의 모음 */
		return "admin/home";
		}
	
	/* 회원관리 리스트 */
	@RequestMapping(value = "/admin/member/list", method = RequestMethod.GET)
	public String memberList(Locale locale, Model model) {

		return "admin/member/list";
		}
	
	/* 게시물 관리 리스트 */
	@RequestMapping(value = "/admin/board/list", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model) {

		return "admin/board/list";
		}
	
	
}

