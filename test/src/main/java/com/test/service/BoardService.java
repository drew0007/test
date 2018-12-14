package com.test.service;

import java.util.List;

import com.test.domain.BoardVO;

public interface BoardService
{
	public void addBoard(BoardVO board) throws Exception;
	
	public List<BoardVO> getBoardList() throws Exception;
	
	public BoardVO getBoard(int bno) throws Exception;
	
	public void hitPlus(int bno) throws Exception;
	
	public void updateBoard(BoardVO board) throws Exception;

	public void deleteBoard(int bno) throws Exception;
}
