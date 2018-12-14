package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.BoardVO;
import com.test.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardRestController
{
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list")
	public List<BoardVO> listBoard() throws Exception{
		List<BoardVO> board = boardService.getBoardList();
		return board;
	}
}
