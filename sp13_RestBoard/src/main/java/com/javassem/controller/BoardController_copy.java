package com.javassem.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController_copy {
	
	@Autowired
	private BoardService boardService;

		//
		@RequestMapping("/{step}.do")
		public String viewPage(@PathVariable String step) {
			return step;
		}
	
		// 글 목록 검색
		@RequestMapping("/http://localhost:8080/rest/board/getBoard.do")
		public void getBoardList(BoardVO vo, Model model) {
			
			model.addAttribute("boardList", boardService.getBoardList(vo));
		}
	
		// 글 등록
		@RequestMapping(value = "/saveBoard.do")
		public String insertBoard(BoardVO vo) throws IOException {
			
			boardService.insertBoard(vo);
			return "redirect:/getBoardList.do";
		}

		// 글 수정
		@RequestMapping("/updateBoard.do")
		public String updateBoard(@ModelAttribute("board") BoardVO vo) {
			boardService.updateBoard(vo);
			return "redirect:/getBoard.do?seq="+vo.getSeq();
		}

		// 글 삭제
		@RequestMapping("/deleteBoard.do")
		public String deleteBoard(BoardVO vo) {
			boardService.deleteBoard(vo);
			return "redirect:/board/getBoardList.do";
		}

		// 글 상세 조회
		@RequestMapping("/getBoard.do")
		public void getBoard(BoardVO vo, Model model) {
			model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장			
		}
		
		//------------------------------------------
		@RequestMapping("/test.do")
		public void test(String name){
			System.out.println("/test 요청 " + name);
		}
		
		@RequestMapping("/test_get.do")
		public String test_get(@PathVariable String name){
			
			System.out.println("/test_get 요청 "+name);
		
			return "<h1>board/test_get 요청 넘어옴</h1>";
		}

	}
