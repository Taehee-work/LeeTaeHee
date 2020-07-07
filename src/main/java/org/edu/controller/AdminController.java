package org.edu.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.edu.service.IF_BoardService;
import org.edu.service.IF_MemberService;
import org.edu.vo.BoardVO;
import org.edu.vo.MemberVO;
import org.edu.vo.PageVO;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {
	
	
	@Inject
	private IF_BoardService boardService;
	
	@Inject
	private IF_MemberService memberService;
	
	//첨부파일 업로드 경로 변수값으로 가져옴:'servlet-context.xml'에 위치
	@Resource(name="uploadPath")
	private String uploadPath;
	
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
	public String memberView(@RequestParam("user_id") String user_id,Locale locale, Model model) throws Exception {
		MemberVO memberVO = memberService.viewMember(user_id);
		model.addAttribute("memberVO",memberVO);
		return "admin/member/member_view";
		}
	
	/* 회원관리 > 등록 */
	@RequestMapping(value = "/admin/member/write", method = RequestMethod.GET)
	public String memberWrite(Locale locale, Model model) throws Exception {

		return "admin/member/member_write";
		}
	
	@RequestMapping(value = "/admin/member/write", method = RequestMethod.POST)
	public String memberWrite(MemberVO memberVO, Locale locale, RedirectAttributes rdat) throws Exception {
		memberService.insertMember(memberVO);
		rdat.addFlashAttribute("msg", "수정");
		return "redirect:/admin/member/list";
		}
	
	/* 회원관리 > 수정 */
	@RequestMapping(value = "/admin/member/update", method = RequestMethod.GET)
	public String memberUpdate(@RequestParam("user_id") String user_id,Locale locale, Model model) throws Exception {
		MemberVO memberVO = memberService.viewMember(user_id);
		model.addAttribute("memberVO", memberVO);
		return "admin/member/member_update";
		}
	
	@RequestMapping(value = "/admin/member/update", method = RequestMethod.POST)
	public String memberUpdate(MemberVO memberVO, Locale locale, RedirectAttributes rdat) throws Exception {
		memberService.updateMember(memberVO);
		rdat.addFlashAttribute("msg", "수정");
		return "redirect:/admin/member/view?user_id="+ memberVO.getUser_id();
		}
	
	/* 회원관리 > 삭제	 */
	@RequestMapping(value = "/admin/member/delete", method = RequestMethod.POST)
	public String memberDelete(@RequestParam("user_id") String user_id,Locale locale,RedirectAttributes rdat) throws Exception {
		memberService.deleteMember(user_id);
		rdat.addFlashAttribute("msg","삭제");
		return "redirect:/admin/member/list";
		}

/*--Board---------------------------------------------------------------------*/	
	/* 게시물 관리 리스트 */
	@RequestMapping(value = "/admin/board/list", method = RequestMethod.GET)
	public String boardList(@ModelAttribute("pageVO") PageVO pageVO,Locale locale, Model model) throws Exception {
		//PageVO pageVO = new PageVO(); //매개변수로 받기전 테스용
		if(pageVO.getPage()==null) {
			pageVO.setPage(1);//초기 page변수값 지정
		}
		pageVO.setPerPageNum(10);//1page당 보여줄 게시물수 강제 지정
		pageVO.setTotalCount(boardService.countBno(pageVO));
		List<BoardVO> list = boardService.selectBoard(pageVO);
		model.addAttribute("boardList", list);
		model.addAttribute("pageVO", pageVO);
		return "admin/board/board_list";
		}
	
	/**
	 * 게시물 상세보기에서 첨부파일 다운로드 메서드 구현
	 */
	
	@RequestMapping(value="/download",method=RequestMethod.GET)
	@ResponseBody
	public FileSystemResource fileDownload(@RequestParam("filename") String fileName, HttpServletResponse response) {
		File file = new File(uploadPath+"/"+fileName);
		response.setContentType("application/download; utf-8");
		response.setHeader("content-Disposition", "attachment;filename="+ fileName);
		return new FileSystemResource(file);
	}
	/**
	 * 파일 업로드 메서드(공통)
	 * @throws IOException 
	 */
	public String[] fileUpload(MultipartFile file) throws IOException {
		String originalName = file.getOriginalFilename();//jsp에서 전송받은 파일의 이름을 저장
		UUID uid=UUID.randomUUID();//랜덤문자 구하기(UUID)
		String saveName = uid.toString() + "." + originalName.split("\\.")[1]; //기존의 한글문자 깨져서 +"."+originalName
		String[]files = new String[] {saveName}; //형변환한 saveName에 files에 담아서 boardVO.set 메서드에 files 매개변수 지정
		byte [] fileData = file.getBytes();
		File target = new File(uploadPath,saveName);
		FileCopyUtils.copy(fileData, target);
		return files;
	}		
	
	
	/* 게시물 상세보기  */
	@RequestMapping(value = "/admin/board/view", method = RequestMethod.GET)
	public String boarbView(@ModelAttribute("pageVO") PageVO pageVO, @RequestParam("bno") Integer bno,Locale locale, Model model) throws Exception {
		BoardVO boardVO = boardService.viewBoard(bno);
		//첨부 파일명 출력코딩
		List<String> files = boardService.selectAttach(bno);
		String[] filenames = new String[files.size()];  
		int cnt = 0;
		for(String fileName:files) {
			filenames[cnt++]=fileName;
		}
		
		//여러개 파일에서 1개의 파일만 받는 것으로 변경
		//String[] filenames = new String[] {files};
		boardVO.setFiles(filenames);
		model.addAttribute("boardVO", boardVO);
		model.addAttribute("pageVO", pageVO);
		return "admin/board/board_view";
		}
	
	/* 게시물 관리 > 등록  */	
	@RequestMapping(value = "/admin/board/write", method = RequestMethod.GET)
	public String boardWrite(Locale locale,Model model) throws Exception {
			return "admin/board/board_write";
	}
			
	@RequestMapping(value = "/admin/board/write", method = RequestMethod.POST)
	public String boardWrite(MultipartFile file,@Valid BoardVO boardVO,Locale locale,RedirectAttributes rdat) throws Exception {
		//System.out.println("===첨부파일없이 저장===" + file.getOriginalFilename());
		if(file.getOriginalFilename() == "") {
			boardService.insertBoard(boardVO);
		}else {
			String[] files = fileUpload(file);
			boardVO.setFiles(files);
			boardService.insertBoard(boardVO);
/*			String originalName = file.getOriginalFilename();
			UUID uid=UUID.randomUUID();//랜덤문자 구하기(UUID)
			String saveName = uid.toString() + "." + originalName.split("\\.")[1]; //기존의 한글문자 깨져서 +"."+originalName
			String[]files = new String[] {saveName}; //형변환한 saveName에 files에 담아서 boardVO.set 메서드에 files 매개변수 지정
			boardVO.setFiles(files);
			boardService.insertBoard(boardVO);
			//위는 DB에 첨부파일명을 저장하기 까지
			//아래부터 실제 파일을 폴더에 저장하기 시작
			byte [] fileData = file.getBytes();
			File target = new File(uploadPath,saveName);
			FileCopyUtils.copy(fileData, target);*/
		}		
		rdat.addFlashAttribute("msg", "입력");
		return "redirect:/admin/board/list";
	}
	
	/* 게시물 관리 > 수정  */	
	@RequestMapping(value = "/admin/board/update", method = RequestMethod.GET)
	public String boardUpdate(@ModelAttribute("pageVO") PageVO pageVO,@RequestParam("bno") Integer bno, Locale locale, Model model) throws Exception {
		BoardVO boardVO = boardService.viewBoard(bno);
		model.addAttribute("boardVO", boardVO);
		model.addAttribute("pageVO",pageVO);
		return "admin/board/board_update";
	}
			
	@RequestMapping(value="/admin/board/update", method=RequestMethod.POST)
	public String boardUpdate(@ModelAttribute("pageVO") PageVO pageVO,MultipartFile file, @Valid BoardVO boardVO,Locale locale,RedirectAttributes rdat) throws Exception {
		if(file.getOriginalFilename() == "") {//조건:첨부파일 전송 값이 없으면
			boardService.updateBoard(boardVO);
		}else {
			//기존에 등록된 첨부파일 삭제처리(아래)
			List<String> delFiles = boardService.selectAttach(boardVO.getBno());
			for(String fileName  : delFiles) {
				//실제파일 삭제
				File target = new File(uploadPath,fileName);
				if(target.exists()) {//조건:해당경로에 파일명이 존재하면 실행
					target.delete();//파일삭제
				}// ./end if
			}// ./end for
			//신규파일 업로드
			String[] files = fileUpload(file);//실제 파일 업로드 후 파일명 리턴
			boardVO.setFiles(files);//데이터베이스에 가기전에 set으로 지정[DB - VO - DAO클래스]
			boardService.updateBoard(boardVO);
		}// ./end if
		rdat.addFlashAttribute("msg", "수정");
		return "redirect:/admin/board/view?bno=" + boardVO.getBno()+"&page=" + pageVO.getPage();
	}
	
	/* 게시물 관리 > 삭제  */	
	@RequestMapping(value = "/admin/board/delete", method = RequestMethod.POST)
	public String boardDelete(@RequestParam("bno") Integer bno, Locale locale, RedirectAttributes rdat) throws Exception {
		List<String> files = boardService.selectAttach(bno);
		boardService.deleteBoard(bno);
		//첨부파일 삭제(아래)
		for(String fileName:files) {
			//삭제명령문 추가(아래)
			File target = new File(uploadPath,fileName);
			if(target.exists()) {
				target.delete();
			}
		}

		rdat.addFlashAttribute("msg", "삭제");
		return "redirect:/admin/board/list";
	}

}