package org.edu.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.edu.service.IF_BoardService;
import org.edu.service.IF_MemberService;
import org.edu.vo.BoardVO;
import org.edu.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	
	@Inject
	private IF_BoardService boardService;
	
	@Inject
	private IF_MemberService memberService;
		
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
	public String memberList(Locale locale, Model model) throws Exception {
		List<MemberVO> list = memberService.selectMember();
		/* model 변수로 jsp화면으로 memberService에서 
		선택한 list변수 값을 memberList변수명으로 보낸다 
		model{list -> memberList -> jsp} 보낸다 */
		model.addAttribute("memberList", list);
		return "admin/member/member_list";
		}
	
	/* 회원관리 상세보기 */
	@RequestMapping(value = "/admin/member/view", method = RequestMethod.GET)
	public String memberView(Locale locale, Model model) throws Exception {

		return "admin/member/member_view";
		}


	/* 게시물 관리 리스트 */
	@RequestMapping(value = "/admin/board/list", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model) throws Exception {
		List<BoardVO> list = boardService.selectBoard();
		model.addAttribute("boardList", list);
		return "admin/board/board_list";
		}
	
}

