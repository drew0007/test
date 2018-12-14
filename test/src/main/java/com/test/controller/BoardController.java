package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.domain.BoardVO;
import com.test.mapper.BoardMapper;
import com.test.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController
{
	@Autowired
	BoardService boardService;
	
	//게시글 목록
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getBoardList() throws Exception{
		List<BoardVO> list = boardService.getBoardList();
		
		return new ModelAndView("boardList", "list", list);
	}
	
	//게시글 작성 페이지
	@RequestMapping(value="/post", method=RequestMethod.GET)
	public ModelAndView addBoard() throws Exception{
		return new ModelAndView("boardWrite");
	}
	
	//게시글 작성
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public String addBoard(@ModelAttribute("BoardVO") BoardVO board) throws Exception {
		boardService.addBoard(board);
		
		return "redirect://localhost:8088/board";
	}
	
	//게시글 조회
	@RequestMapping(value="/{bno}", method=RequestMethod.GET)
	public ModelAndView getBoard(@PathVariable("bno") int bno) throws Exception{
		boardService.hitPlus(bno);
		BoardVO board =  boardService.getBoard(bno);
		
		return new ModelAndView("boardView", "board", board);
	}
	
	//게시글 수정 페이지
	@RequestMapping(value="/post/{bno}", method=RequestMethod.GET)
	public ModelAndView updateBoard(@PathVariable("bno") int bno) throws Exception{
		BoardVO board = boardService.getBoard(bno);
		
		return new ModelAndView("boardUpdate", "board", board);
	}
	
	//게시글 수정
	@RequestMapping(value="/post/{bno}", method=RequestMethod.PATCH)
	public String updateBoard(@ModelAttribute("BoardVO") BoardVO board
														, @PathVariable("bno") int bno) throws Exception{
		boardService.updateBoard(board);
		
		return "redirect://localhost:8088/board/"+bno;
	}
	
	//게시글 삭제
	@RequestMapping(value="/post/{bno}", method=RequestMethod.DELETE)
	public String deleteBoard(@PathVariable("bno") int bno) throws Exception{
		boardService.deleteBoard(bno);
		
		return "redirect://localhost:8088/board";
	}
}
